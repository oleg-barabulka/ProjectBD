<!DOCTYPE html>
<html>
<head>
    <title>LIBRARY</title>
</head>
<body>
<h1>Library</h1><hr>
<h4>Книги в библиотеке</h4>
<form action="/" method="get">
    Поиско по названию книги: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>
<#list literature as literature>
    <div>
        <p><b>${literature.title}</b> ${literature.author} | <a href="/literature/${literature.literatureId}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Книг нет</h3>
</#list>
<hr>
<h3>Добавить новую книгу</h3>
<form action="/literature/create" method="post">
    Название книги: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Автор книги: <label>
        <input type="text" name="author"/>
    </label><br><br>
    Дата публикации: <label>
        <input type="number" name="yearOfPublishing"/>
    </label><br><br>
    Издание: <label>
        <input type="text" name="edition"/>
    </label><br><br>
    Доступ: <label>
        <input type="text" name="availability"/>
    </label><br><br>
    Дата получения: <label>
        <input type="datetime-local" name="dateOfAdmission"/>
    </label><br><br>
    Пункт выдачи: <label>
        <input type="number" name="pointOfIssueId"/>
    </label><br><br>
    <input type="submit" value="Добавить книгу"/>
</form>
</body>
</html>