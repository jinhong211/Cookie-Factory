<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>

        <table align="center" style="width:100%;">

            <tr>

                <td><asp:Label ID="IDtext" runat="server" Text="ID"></asp:Label></td>

                <td><asp:TextBox ID="IDinput" runat="server"></asp:TextBox></td>

            </tr>

            <tr>

                <td><asp:Label ID="PWtext" runat="server" Text="passeword"></asp:Label></td>

                <td><asp:TextBox ID="PWinput" runat="server"></asp:TextBox></td>

            </tr>

            <tr>

                <td></td>

                <td><asp:Button ID="btnHello" runat="server" Text="Login" onclick="btnHello_Click"

                        BackColor="#FFC78E" BorderColor="#A0A0A0" Font-Size="18px" ForeColor="Red"

                /></td>

            </tr>

            <tr>

                <td></td>

                <td><asp:Label ID="lblText" runat="server" Text=""></asp:Label></td>

            </tr>

        </table>
       
    </div>
    </form>
</body>
</html>
