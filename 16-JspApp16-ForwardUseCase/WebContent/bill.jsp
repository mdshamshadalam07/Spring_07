<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <% //read form data
      String name=request.getParameter("iname"); 
      float price=Float.parseFloat(request.getParameter("iprice"));
      float qty=Float.parseFloat(request.getParameter("iqty"));  
      //calculate bill Amount
      float billAmount=price* qty;
       
      if(billAmount>=50000){ %>
    	   <jsp:forward page="discount.jsp">
    	           <jsp:param value="<%=billAmount%>" name="bAmt"/>
    	   </jsp:forward>
    	 <%
          }
          else{
    	 %>
    	     <h1 style="color:red;text-align:center"> From Bill.jsp  </h1>
    	     <h1 style="color:Green;text-align:center"><br><b>Item Name :: <%=name %> 
											    	   <br>Item Price :: <%=price %>
											    	   <br>Item Quantity :: <%=qty %> 
											    	   <br>Bill Amount :: <%=billAmount %>
											    	   </b>
    	    <%
          }
    	    %>   
    	    <br><br><br>
           
         <center><a href = 'input.html'> <img src ='home.jpg' width='40' height='40'></a></center>
           
       
      
      