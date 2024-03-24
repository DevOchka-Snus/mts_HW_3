package ru.mts.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import ru.mts.factory.AnimalFactory;
import ru.mts.factory.AnimalNameProvider;
import ru.mts.factory.AnimalRandomNameProvider;
import ru.mts.service.AnimalRepository;
import ru.mts.service.CreateAnimalService;
import ru.mts.service.impl.AnimalRepositoryImpl;
import ru.mts.service.impl.CreateAnimalServiceImpl;

import java.util.Map;

@TestConfiguration
@EnableConfigurationProperties(AnimalConfigurationProperties.class)
public class AnimalTestConfiguration {

    private static final String TEST_BEAN_NAME_SUFFIX = "Test";

    @Primary
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = CreateAnimalService.NAME + TEST_BEAN_NAME_SUFFIX)
    public CreateAnimalService createAnimalService(@Autowired Map<String, AnimalFactory> animalFactories) {
        return new CreateAnimalServiceImpl(animalFactories);
    }

    @Primary
    @Bean(name = AnimalBeanPostProcessor.NAME + TEST_BEAN_NAME_SUFFIX)
    public AnimalBeanPostProcessor animalBeanPostProcessor() {
        return new AnimalBeanPostProcessor();
    }

    @Primary
    @Bean(name = AnimalRepository.NAME + TEST_BEAN_NAME_SUFFIX)
    public AnimalRepository animalRepository(@Autowired ObjectProvider<CreateAnimalService> createAnimalServicesBeanProvider) {
        return new AnimalRepositoryImpl(createAnimalServicesBeanProvider);
    }

    @Primary
    @Bean(name = AnimalNameProvider.NAME + TEST_BEAN_NAME_SUFFIX)
    public AnimalNameProvider animalNameProvider(@Autowired AnimalConfigurationProperties animalConfigurationProperties) {
        return new AnimalRandomNameProvider(animalConfigurationProperties);
    }

}
