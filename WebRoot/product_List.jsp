<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="java.util.*,learn.jdbc.po.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有产品信息</title>
</head>
<body>
<% List<Operator> OperatorList=(ArrayList)session.getAttribute("operator");%>
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
 

<form action="./insert.do" method="post">
<table class="gridtable" onselectstart="return false;">
<tr>
<th>行号</th>
<th>操作员号</th>
<th>身份证号</th>
<th>节点号</th>
<th>状态</th>
<th>权限</th>
<th>密码</th>
<th>姓名</th>
<th>创建人</th>
<th>复核人</th>
<th>创建日期</th>
<th>保留</th>
</tr>

<%for(Operator operator:OperatorList) {%>
<tr>
<td><%=operator.getBankID() %></td> 
<td><%=operator.getOperatorID() %></td> 
<td><%=operator.getSigCod() %></td> 
<td><%=operator.getNode() %></td> 
<td><%=operator.getStatus() %></td> 
<td><%=operator.getPermission() %></td> 
<td><%=operator.getPassword() %></td> 
<td><%=operator.getOperatorName() %></td> 
<td><%=operator.getCreator() %></td> 
<td><%=operator.getChecker() %></td> 
<td><%=operator.getCreateDate() %></td> 
<td><%=operator.getReserved() %></td> 
<td><a href="del?OperatorID=<%=operator.getOperatorID() %>">删除</td>
<td><a href="upd?OperatorID=<%=operator.getOperatorID() %>">更新</td>
</tr>
<% }%>
<tr>
	<td><input type="text" name="BankID" size="16" ></td>
	<td><input type="text" name="OperatorID" size="22"></td>
	<td><input type="text" name="SigCod" size="22"></td>
	<td><input type="text" name="Node" size="8" ></td>
	<td><input type="text" name="Status" size="1"></td>
	<td><input type="text" name="Permission" size="2"></td>
	<td><input type="text" name="Password" size="16"></td>
	<td><input type="text" name="OperatorName" size="22"></td>
	<td><input type="text" name="Creator" size="22"></td>
	<td><input type="text" name="Checker" size="22"></td>
	<td><input type="text" name="CreateDate" ></td>
	<td><input type="text" name="Reserved" ></td>
	<td><input type="submit" value="录入"></td>	
</tr>
</table>
</form>
</body>
</html>