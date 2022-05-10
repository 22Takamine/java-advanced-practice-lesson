<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
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
	<p>${requestScope.result}</p>
	<form action="./login.jsp" method="post">
    	<button type="submit">戻る</button>
    
    </form>

</body>
</html>