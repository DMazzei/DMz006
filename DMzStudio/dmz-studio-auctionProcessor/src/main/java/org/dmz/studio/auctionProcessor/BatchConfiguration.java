package org.dmz.studio.auctionProcessor;

import javax.sql.DataSource;

import org.dmz.studio.repository.AuctionIndexFilesRepository;
import org.dmz.studio.repository.RepositoryConfiguration;
import org.dmz.studio.repository.model.AuctionIndexFiles;
import org.dmz.studio.scheduledTasks.ScheduledAuctionTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableBatchProcessing
@Import(RepositoryConfiguration.class)
public class BatchConfiguration {
    
    private static final Logger log = LoggerFactory.getLogger(BatchConfiguration.class);

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    private AuctionIndexFilesRepository repository;
    
    private final String realmName = "zul'jin";
    
     // tag::readerwriterprocessor[]
    @Bean
    public AuctionIndexFiles reader() {
        
        return repository.findByRealm(realmName);
    }

    @Bean
    public PersonItemProcessor processor() {
        return new PersonItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Person> writer() {
        JdbcBatchItemWriter<Person> writer = new JdbcBatchItemWriter<Person>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Person>());
        writer.setSql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)");
        writer.setDataSource(dataSource);
        return writer;
    }
     // end::readerwriterprocessor[]
    
    // tag::jobstep[]
//    @Bean
//    public Job importUserJob(JobCompletionNotificationListener listener) {
//        return jobBuilderFactory.get("importUserJob")
//                .incrementer(new RunIdIncrementer())
//                .listener(listener)
//                .flow(step1())
//                .end()
//                .build();
//    }

//    @Bean
//    public Step step1() {
//
//        return stepBuilderFactory.
//        // TODO ...
//    }
    // end::jobstep[]
}
