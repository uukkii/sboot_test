## Домашнее задание к занятию 7.1: Spring boot: назначение, внутреннее устройство

### Задача Conditional приложение

**v.1.0**

Задание реализовано. 

Точка входа в программу - `Application.java`
В пакете `ru.netology.profiles` находится интерфейс `SystemProfile` с единственным методом `getProfile()`
и две его реализации - `DevProfile`, возвращающий строку _"Current profile is dev"_, и `ProductionProfile`,
возвращающий строку _"Current profile is production"_.

В пакете `ru.netology.config` содержится класс конфигурации `JavaConfig`, содержащий два **Bean** с 
**ConditionalOnProperty** в зависимости от значения _netology.profile.dev_ в `application.properties`.

В пакете `ru.netology.controller` находится класс контроллера `ProfileController`.

После запуска сервера на **GET-запрос** по адресу _localhost:9999/profile_ получаем ответ:
```
Current profile is dev
```