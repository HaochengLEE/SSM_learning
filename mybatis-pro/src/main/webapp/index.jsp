<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sum.com/jsp/jstl/core"%>
<html>
    <head>
        <title>员工管理后台</title>
        <!-- Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.7.1/angular.min.js"></script>

        <link rel="stylesheet" href="">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="page-header">
                    <h1>即刻后台管理系统&nbsp<small>用户管理</small></h1>
                </div>
            </div>
            <div class="row">
                <div class="jumbotron">
                    <h3>即刻云欢迎你</h3>
                    <p>今天是你在即刻云的第1024天</p>
                    <p><a class="btn btn-primary btn-lg" href="#" role="button">点此立刻办理离职手续</a></p>
                </div>
            </div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">员工编号</th>
                    <th scope="col">登录名称</th>
                    <th scope="col">昵称</th>
                    <th scope="col">年龄</th>
                    <th scope="col">性别</th>
                    <th scope="col">邮箱</th>
                    <th scope="col">联系方式</th>
                    <th scope="col">账号创建时间</th>
                    <th scope="col">最后修改时间</th>
                    <th scope="col">最后登录时间</th>
                    <th scope="col">用户状态</th>
                    <th scope="col">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="employee" items="${employeelist}">
                <tr>
                    <th scope="row">1</th>
                    <td>admin</td>
                    <td>aaa</td>
                    <td>18</td>
                    <td>男</td>
                    <td>@mdo</td>
                    <td>13888</td>
                    <td>2017-10-15</td>
                    <td>2017-10-19</td>
                    <td>2017-10-21</td>
                    <td>正常</td>
                    <td>
                        <a>查看</a>
                        <a>修改</a>
                        <a>删除</a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </body>
</html>