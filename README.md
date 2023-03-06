#documentation
this is mine documentation/notes for my Webstack. 

##start af et nyt webprojekt

1.opret nyt project i intelij
2. vælg javaEE projectskabelon
3. Java + Maven
4. Servlet dependecies

![img.png](img.png)

## Arkitektur

vi bruge en slags MVC - pattern.

![img_1.png](img_1.png)

- M(odel) - entiteter og hjælpe - metoder og klasser. Business - logic
- V(iew) -JSP og frontend ( css , bootstrap mm)
- C(ontrol) - Servlets

Husk! ingen kommunication mellem Model og View. Gå altid igennem controlleren.

