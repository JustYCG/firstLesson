<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ page import="java.util.*,learn.jdbc.po.*" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎登陆</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  ——————————————————登陆人员信息————————————————</br>
  操作人员姓名： ${sessionScope.operatorInf.operatorName}</br>
  部   门   代   号 ： ${sessionScope.operatorInf.PID}</br>
  部   门   代   号 ： ${sessionScope.operatorInf.name}</br>
  
   ——————————————————————————————————————————————</br>
 <!--
 
  ——————————————————登陆人员信息————————————————</br>
  操作人员姓名： ${operatorInf.operatorName}</br>
  部   门   代   号 ： ${operatorInf.PID}</br>
  部   门   代   号 ： ${operatorInf.name}</br>
  
   ——————————————————————————————————————————————</br>-->
 <a href="query">管理操作人员信息</a>
 </body>
</html>
