<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 14.01.2019
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>winder</title>
    <link rel="icon" type="image/png" href="<c:url value="/resources/img/favicons.png"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/index.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap-3.3.7/css/bootstrap.css"/>"/>
    <script rel="script" type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
    <script rel="script" type="text/javascript" src="<c:url value="/resources/bootstrap-3.3.7/js/bootstrap.js"/>"></script>
    <script rel="script" type="text/javascript" src="<c:url value="/resources/js/sockjs-0.3.4.js"/>"></script>
    <script rel="script" type="text/javascript" src="<c:url value="/resources/js/stomp.js"/>"></script>
</head>
<body>
<div id="main" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <a href="/logout" class="btn btn-sm btn-success" style="margin-left: 100%; margin-top: 10px; margin-bottom: 10px;">Выход</a>
            </div>
        </div>
    </div>
    <div class="container">
        <table class="table">
            <tr>
                <th>Команда</th>
                <th>Допустимые значения</th>
                <th>Значение Л.</th>
                <th>Значение П.</th>
            </tr>
            <tr>
                <td rowspan="2">Заданная длинна </td>
                <td rowspan="2">от 0 до 2000 м</td>
                <td><input type="number" disabled id="SetLengthLReadValue" class="form-control" name="SetLengthLReadValue" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="SetLengthRReadValue" class="form-control" name="SetLengthRReadValue" value="0" style="width: 120px;"></td>
            </tr>
            <tr>
                <td><input type="number" id="SetLengthLWriteValue" class="form-control" name="SetLengthLWriteValue" value="0" style="width: 120px;"></td>
                <td><input type="number" id="SetLengthRWriteValue" class="form-control" name="SetLengthRWriteValue" value="0" style="width: 120px;"></td>
            </tr>
            <tr>
                <td >Фактическая длинна </td>
                <td > м </td>
                <td><input type="number" disabled id="CurrentLengthLReadValue" class="form-control" name="CurrentLengthLReadValue" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="CurrentLengthRReadValue" class="form-control" name="CurrentLengthRReadValue" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td >Общая длинна </td>
                <td > м </td>
                <td><input type="number" disabled id="AllLengthLReadValue" class="form-control" name="AllLengthLReadValue" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="AllLengthRReadValue" class="form-control" name="AllLengthRReadValue" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td >Скорость </td>
                <td >м/мин.</td>
                <td><input type="number" disabled id="SpeedReadLValue" class="form-control" name="SpeedReadLValue" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="SpeedReadRValue" class="form-control" name="SpeedReadRValue" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td >Катушка</td>
                <td >шт.</td>
                <td><input type="number" disabled id="BobbinReadLValue" class="form-control" name="BobbinReadLValue" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="BobbinReadRValue" class="form-control" name="BobbinReadRValue" value="0" style="width: 120px;"></td>
            </tr>

        </table>
    </div>
</div>

<script rel="script" type="text/javascript" src="<c:url value="/resources/js/winder.js"/>"></script>
</body>
<body>

</body>
</html>
