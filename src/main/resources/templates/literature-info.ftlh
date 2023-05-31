<!DOCTYPE html>
<html>
<head>
    <title>LIBRARY</title>
</head>
<body>
<h1>Library</h1><hr>
<h4>Подробная информация о книге</h4>
<b>Название книги: </b>${literature.title}<br>
<b>Автор книги: </b>${literature.author}<br>
<b>Год выпуска: </b>${literature.yearOfPublishing}<br>
<b>Издание: </b>${literature.edition}<br>
<b>Дата получения: </b>${literature.dateOfAdmission}<br>
<b>Номер пункта выдачи: </b>${literature.pointOfIssueId}<br>
<hr>
<form action="/literature/delete/${literature.literatureId}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
<hr>
<h3>Изменить данные книги</h3>
<form action="/literature/update/${literature.literatureId}" method="post">
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
        <input type="date" name="dateOfAdmission"/>
    </label><br><br>
    Пункт выдачи: <label>
        <input type="number" name="pointOfIssueId"/>
    </label><br><br>
    <input type="submit" value="Изменить параметры"/>
</form>
</body>
</html>