<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
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
<td><asp:Button ID="btnHello2" runat="server" Text="Login" onclick="btnHello_Click2"

                        BackColor="#FFC78E" BorderColor="#A0A0A0" Font-Size="18px" ForeColor="Red"

                /></td>
</tr>

    <tr>

                <td></td>

                <td><asp:Label ID="lblText2" runat="server" Text=""></asp:Label></td>

            </tr>
</table>
    </div>
    </form>
</body>
</html>
