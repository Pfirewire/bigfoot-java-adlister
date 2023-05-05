
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Pizza Order" />
  </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

    <form method="POST" action="/pizza-order">
        <label for="crust-type">Crust Type: </label>
        <select name="crust-type" id="crust-type">
          <option value="thin">Thin</option>
          <option value="hand-tossed">Hand Tossed</option>
          <option value="pan">Pan</option>
          <option value="stuffed">Stuffed</option>
        </select>
        <label for="sauce-type">Sauce Type: </label>
        <select name="sauce-type" id="sauce-type">
          <option value="classic">Classic</option>
          <option value="bbq">Barbeque</option>
          <option value="ranch">Ranch</option>
          <option value="white">White</option>
        </select>
        <label for="size">Size: </label>
        <select name="size" id="size">
          <option value="small">Small</option>
          <option value="med">Medium</option>
          <option value="large">Large</option>
          <option value="x-large">Extra Large</option>
        </select>
      <br>
      <h4>Toppings:</h4>
      <input type="checkbox" id="topping1" name="topping1" value="sausage">
      <label for="topping1">Sausage</label><br>
      <input type="checkbox" id="topping2" name="topping2" value="pepperoni">
      <label for="topping2">Pepperoni</label><br>
      <input type="checkbox" id="topping3" name="topping3" value="bacon">
      <label for="topping3">Bacon</label><br>
      <input type="checkbox" id="topping4" name="topping4" value="pepper">
      <label for="topping4">Green Pepper</label><br>
      <input type="checkbox" id="topping5" name="topping5" value="onion">
      <label for="topping5">Red Onion</label>
      <br>
      <br>
      <input type="submit" value="Submit">
    </form>

</body>
</html>
