<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<style>
body {
  border: solid 2px #000080;
  padding: 5px;
}
.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>
	<form action="/login" method="post">
	<div>${requestScope.msg}</div>
	
    <label>ID：</label>
    <input type="text" name="name"> ${requestScope.name}
    
    <br>
    <label>PASS：</label>
    <input type="text" name="pass"> ${requestScope.pass}
    
    <br>
    <button type="submit">ログイン</button>
    
    </form>

</body>
</html>