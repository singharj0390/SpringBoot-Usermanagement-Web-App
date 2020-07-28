<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
<!DOCTYPE html>
<html>
<head>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <script src="./js/app.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
       $( function(){
    	   $("#datepicker").datepicker();
       });
</script>
</head>
<body>
                 <h1>Registration Page</h1>
                 
                 <form:form modelAttribute="userAcc" >
                      <table>
                            <tr> 
                                 <th>First Name:</th>
                                 <td>
                                       <form:input path="firstName"/>
                                 </td>
                            </tr>
                            <tr>
                                   <th>Last Name:</th>
                                   <td><form:input path="lastName"/></td>
                            </tr>
                            <tr>
                                   <th>Email:</th>
                                   <td><form:input path="email"/></td>
                            </tr>
                            <tr>
                                   <th>PhNo:</th>
                                   <td><form:input path="phoneNo"/></td>
                            </tr>
                            <tr>
                                   <th>Date-Of-Birth</th>
                                   <td><form:input path="dob" id="datepicker"/></td>
                            </tr>
                            <tr>
                                    <th>Gender:</th>
                                    <td>Male:<form:radiobutton path="gender" value="M" id="gen"/>
                                            Female:<form:radiobutton path="gender" value="F" id="gen"/>
                                    </td>
                            </tr>
                            <tr>
                                     <th>Country:</th>
                                     <td><form:select path="countryId">
                                              <form:option value="">-Select-</form:option>
                                               <form:options items="${countries}"/>
                                     </form:select></td>
                            </tr>
                            <tr>
                                  <th>State:</th>
                                  <td><form:select path="stateId">
                                           <form:option value="">-Select-</form:option>
                                  </form:select></td>
                            </tr>
                            <tr>
                                  <th>City:</th>
                                  <td><form:select path="cityId">
                                         <form:option value="">-Select-</form:option>
                                  </form:select></td>
                            </tr>
                            <tr>
                                  <th></th>
                                  <td>
                                        <input type="submit" value="Reset">&nbsp;<input type="submit" value="Save">
                                  </td>
                            </tr>
                      </table>
                 </form:form>
</body>
</html>