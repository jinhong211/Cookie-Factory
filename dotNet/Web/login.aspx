<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <form id="form1"  action="login.aspx" method="post">
<table style="width:100%;">
<tr>
<td>帐号：</td>
<td>
<input id="Text1" name="username" type="text" /></td>
</tr>
<tr>
<td>密码：</td>
<td>
<input id="Text2" name="userpwd" type="text" /></td>
</tr>
<tr>
<td colspan="2">
<input id="btnlogin" type="submit" value="登陆" /></td>
</tr>
</table>
</form>
    </div>
    </form>
</body>
</html>
