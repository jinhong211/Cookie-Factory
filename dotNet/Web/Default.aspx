<%@ Page language="c#" Codebehind="default.aspx.cs" AutoEventWireup="false" Inherits="lsj.WebForm1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" >
<HTML>
<HEAD>
<meta name="GENERATOR" Content="Microsoft Visual Studio 7.0">
<meta name="CODE_LANGUAGE" Content="C#">
<meta name="vs_defaultClientScript" content="JavaScript (ECMAScript)">
<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
</HEAD>
<body MS_POSITIONING="GridLayout">
<FONT face="宋体">
<form runat="server" ID="Form1">
<asp:Label id="Label1" style="Z-INDEX: 101; LEFT: 82px; POSITION: absolute; TOP: 39px" runat="server" Width="55px"


Height="26px">登录名</asp:Label>
<asp:Label id="Label2" style="Z-INDEX: 102; LEFT: 80px; POSITION: absolute; TOP: 84px" runat="server" Width="63px" Height="24px">密　码</asp:Label>
<asp:TextBox id="Userid" style="Z-INDEX: 103; LEFT: 161px; POSITION: absolute; TOP: 39px" runat="server" Width="109px" Height="25px"></asp:TextBox>
<asp:TextBox id="Pwd" style="Z-INDEX: 104; LEFT: 162px; POSITION: absolute; TOP: 81px" runat="server" Width="109px" Height="22px" TextMode="Password"></asp:TextBox>
<asp:Button id="LogButton" style="Z-INDEX: 105; LEFT: 79px; POSITION: absolute; TOP: 125px" runat="server" Width="59px" Height="25px" Text="登　录"></asp:Button>
<asp:Label id="Msg" style="Z-INDEX: 106; LEFT: 161px; POSITION: absolute; TOP: 130px" runat="server" Width="117px" Height="26px"></asp:Label>
<asp:RequiredFieldValidator id="RequiredFieldValidator1" style="Z-INDEX: 107; LEFT: 290px; POSITION: absolute; TOP: 43px" runat="server" Width="162px" Height="18px" ErrorMessage="RequiredFieldValidator" ControlToValidate="Userid">请输入登录名！</asp:RequiredFieldValidator>
<asp:RequiredFieldValidator id="RequiredFieldValidator2" style="Z-INDEX: 108; LEFT: 292px; POSITION: absolute; TOP: 83px" runat="server" Width="175px" Height="22px" ErrorMessage="RequiredFieldValidator" ControlToValidate="Pwd">请输入登录密码！</asp:RequiredFieldValidator>
</form>
</FONT>
</body>
</HTML>