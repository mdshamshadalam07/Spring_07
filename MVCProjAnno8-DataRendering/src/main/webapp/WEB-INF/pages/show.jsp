<%@ page isELIgnored="false"  import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3> model data is ::: ${name}, ${age}  </h3>
<h3> model data (Colletions)is ::: ${fruitsList}
                                          <br><br> ${phoneSet} 
                                          <br><br> ${subjectMarksMap}
                                          <br><br> ${favColors[0]}..
		                                                  ${favColors[1]}..
		                                                  ${favColors[2]}..
		                                                  ${favColors[3]}
		                                                  <br><br>
		                                                  <%=Arrays.toString((String[])request.getAttribute("favColors"))%>
		                                                  <br><br>
		                                                  <% 
		                                                   for(String color: (String[])request.getAttribute("favColors")) 
		                                                   out.print(color+ "...");
		                                                   %> 
		                                                   <br><br>
		                                                   <c:forEach var="color" items="${favColors}">
		                                                   ${color}...
		                                                   </c:forEach>   
		                                                   
		<br><br> model data (DTO obj) ::: ${empData} <br><br>
		                                                   ${empData.ename},${empData.salary}
      <hr>                                                 
		<b>Model data (listDTO):::</b> ${empList}<br><br>
		<c:forEach var="emp" items="${empList}">
		                                                    ${emp}  <br>                
	   </c:forEach>
     <hr>
 </h3>
    