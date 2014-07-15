<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.util.*,learn.jdbc.po.*;" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'update.jsp' starting page</title>
  </head>
  
  <body>
  <%Bank bank=(Bank)session.getAttribute("bankrs");%>
  <style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
table.gridtable input { width:100%; height:100%;}
</style>
  ——————————————————登陆人员信息————————————————</br>
  操作人员姓名： ${sessionScope.operatorInf.operatorName}</br>
  部   门   代   号 ： ${sessionScope.operatorInf.PID}</br>
  部   门   代   号 ： ${sessionScope.operatorInf.name}</br>
  
   ——————————————————————————————————————————————--></br>

  <form action="./bupd.do" method="post">
  <table class="gridtable">
	<tr>
<th>行号</th>
<th>部门号</th>
<th>组码</th>
<th>等级</th>
<th>部门名称</th>
<th>状态</th>
<th>保留</th>
</tr>
<tr>
	<td><input type="text" name="ID" size="32" value=<%=bank.getID() %> ></td>
	<td><input type="text" name="PID" size="32" value=<%=bank.getPID() %>></td>
	<td><input type="text" name="GID" size="64" value=<%=bank.getGID() %>></td>
	<td><input type="text" name="Level" size="2" value=<%=bank.getLevel() %>></td>
	<td><input type="text" name="Name" size="100" value=<%=bank.getName() %>></td>
	<td><input type="text" name="Status" size="1" value=<%=bank.getStatus() %>></td>
	<td><input type="text" name="Reserved" value=<%=bank.getReserved() %>></td>
	<td><input type="submit" value="更新"></td>
	<td><input type="reset" value="重置"></td>
	
</tr>
</table>
</form>
  </body>
</html>
