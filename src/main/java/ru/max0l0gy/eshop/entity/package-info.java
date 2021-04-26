/**
 * Created by recommendation from the book
 * «Java Persistence with Hibernate, Second Edition»
 * https://www.manning.com/books/java-persistence-with-hibernate-second-edition
 */
@GenericGenerators({

        @GenericGenerator(
                name = Constants.ID_GENERATOR_PORTFOLIO,
                strategy = "enhanced-sequence",

                parameters = {
                        @Parameter(
                                name = "sequence_name",
                                value = Constants.ID_GENERATOR_PORTFOLIO_SEQUENCE_NAME
                        ),
                        @Parameter(
                                name = "initial_value",
                                value = "100"
                        ),
                        @Parameter(
                                name = "increment_size",
                                value = "5"
                        ),
                        @Parameter(
                                name = "optimizer",
                                value = "pooled-lo"
                        ),
                        @Parameter(
                                name = "increment_size",
                                value = "5"
                        ),
                }),
        @GenericGenerator(
                name = Constants.ID_GENERATOR_PORTFOLIO_IMAGE,
                strategy = "enhanced-sequence",
                parameters = {
                        @Parameter(
                                name = "sequence_name",
                                value = Constants.ID_GENERATOR_PORTFOLIO_IMAGE_SEQUENCE_NAME
                        ),
                        @Parameter(
                                name = "initial_value",
                                value = "100"
                        ),
                        @Parameter(
                                name = "increment_size",
                                value = "5"
                        ),
                        @Parameter(
                                name = "optimizer",
                                value = "pooled-lo"
                        )
                })
})

package ru.max0l0gy.eshop.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Parameter;

