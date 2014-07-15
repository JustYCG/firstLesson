<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*,learn.jdbc.po.*;" %>
 <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有部门信息</title>
</head>
<body>
<% List<Bank> bankList=(ArrayList)session.getAttribute("bank");%>
<!-- CSS goes in the document HEAD or added to your external stylesheet -->
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
  
   ——————————————————————————————————————————————</br>
 

<form action="./addBank.do" method="post">
<table class="gridtable" onselectstart="return false;">
<tr>
<th>行号</th>
<th>部门号</th>
<th>组码</th>
<th>等级</th>
<th>部门名称</th>
<th>状态</th>
<th>保留</th>
</tr>

<%for(Bank bank:bankList) {%>
<tr>
<td><%=bank.getID() %></td> 
<td><%=bank.getPID() %></td> 
<td><%=bank.getGID() %></td> 
<td><%=bank.getLevel() %></td> 
<td><%=bank.getName() %></td> 
<td><%=bank.getStatus() %></td> 
<td><%=bank.getReserved() %></td> 
<td><a href="deleteBank?ID=<%=bank.getID() %>">删除</td>
<td><a href="bupdb?ID=<%=bank.getID() %>">更新</td>
</tr>
<% }%>
<tr>
	<td><input type="text" name="ID" size="32" ></td>
	<td><input type="text" name="PID" size="32"></td>
	<td><input type="text" name="GID" size="64"></td>
	<td><input type="text" name="Level" size="2" ></td>
	<td><input type="text" name="Name" size="100"></td>
	<td><input type="text" name="Status" size="1"></td>
	<td><input type="text" name="Reserved" ></td>
	<td><input type="submit" value="录入"></td>	
</tr>
</table>
</form>
</body>
</html>