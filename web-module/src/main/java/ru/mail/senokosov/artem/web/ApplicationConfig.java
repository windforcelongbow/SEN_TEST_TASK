package ru.mail.senokosov.artem.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.mail.senokosov.artem.repository", "ru.mail.senokosov.artem.service"})
public class ApplicationConfig {
}