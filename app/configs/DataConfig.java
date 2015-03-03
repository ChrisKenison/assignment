package configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import play.Logger;
import play.db.DB;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.sofi.models.dao")
public class DataConfig {

    @Bean
    public DataSource dataSource() {
        return DB.getDataSource();
    }

    @Autowired
    @Bean
    public EntityManagerFactory entityManagerFactory(@Value("${db.default.dialect}") String dialect,
                                                     @Value("${sofi.models.packages}") String modelPackages,
                                                     @Value("${sofi.hibernate.showsql}") String hibernateShowSql) {

        Logger.of("EntityManager").debug("Creating EntityManager");

        //boiler plate stuff
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabasePlatform(dialect);
        vendorAdapter.setShowSql("true".equalsIgnoreCase(hibernateShowSql));
        vendorAdapter.setGenerateDdl(false);

        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setPackagesToScan(modelPackages.split(","));
        entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
        entityManagerFactory.setDataSource(dataSource());


        entityManagerFactory.afterPropertiesSet();
        return entityManagerFactory.getObject();
    }

    @Autowired
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
