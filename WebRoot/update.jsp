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
  <%Operator operator=(Operator)session.getAttribute("oprs");%>
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
  操作人员姓名： ${operatorInf.operatorName}</br>
  部   门   代   号 ： ${operatorInf.PID}</br>
  部   门   代   号 ： ${operatorInf.name}</br>
  
   ——————————————————————————————————————————————--></br>

  <form action="./update.do" method="post">
  <table class="gridtable">
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
<tr>
	<td><input type="text" name="BankID" value="<%=operator.getBankID() %>"></td>
	<td><input type="text" name="OperatorID" value="<%=operator.getOperatorID() %>"></td>
	<td><input type="text" name="SigCod" value="<%=operator.getSigCod() %>"></td>
	<td><input type="text" name="Node" value="<%=operator.getNode() %>"></td>
	<td><input type="text" name="Status" value="<%=operator.getStatus() %>"></td>
	<td><input type="text" name="Permission" value="<%=operator.getPermission() %>"></td>
	<td><input type="text" name="Password" value="<%=operator.getPassword() %>"></td>
	<td><input type="text" name="OperatorName" value="<%=operator.getOperatorName() %>"></td>
	<td><input type="text" name="Creator" value="<%=operator.getCreator() %>"></td>
	<td><input type="text" name="Checker" value="<%=operator.getChecker() %>"></td>
	<td><input type="text" name="CreateDate" value="<%=operator.getCreateDate() %>"></td>
	<td><input type="text" name="Reserved" value="<%=operator.getReserved() %>"></td>
	<td><input type="submit" value="更新"></td>
	<td><input type="reset" value="重置"></td>
	
</tr>
</table>
</form>
  </body>
</html>
