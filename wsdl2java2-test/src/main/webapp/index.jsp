<%@ page contentType="text/html;charset=UTF-8"%>

<html lang="it">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
	integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
	integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
	crossorigin="anonymous"></script>
</head>
<body>

	<%
	String contextPath = request.getContextPath();
	int arg0 = 0;
	int arg1 = 0;
	%>

	<form id="myform" name="myform" class="row g-3" action="Calculator"
		method="get">


		<tr>
			<div>
				<td><input type="radio" name="operazione" id="add" value="add">
					+</td>
			</div>
		</tr>

		<tr>
			<td><input type="radio" name="operazione" id="divide" value="div">
				/</td>
			</div>
		</tr>

		<tr>
			<div>
				<td><input type="radio" name="operazione" id="multiply" value="mul">
					*</td>
			</div>
		</tr>

		<tr>
			<div>
				<td><input type="radio" name="operazione" id="subtract" value="sub">
					-</td>
			</div>
		</tr>

		<div class="col-auto">
			<label for="arg0" class="visually-hidden">First parameter</label> <input
				type="number" class="form-control-plaintext" id="arg0" name="arg0"
				value="">
		</div>
		<div class="col-auto">
			<label for="arg1" class="visually-hidden">Second parameter</label> <input
				type="number" class="form-control-plaintext" id="arg1" name="arg1"
				value="">
		</div>

		<button type="submit">Execute operation</button>

	</form>
	<h3>Result here:</h3>
	<div><%=request.getAttribute("result")%></div>

</body>
</html>