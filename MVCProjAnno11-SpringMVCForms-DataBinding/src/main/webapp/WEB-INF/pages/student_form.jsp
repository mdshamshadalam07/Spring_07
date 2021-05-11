<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>


   <form:form      modelAttribute="student"  >
   <table  bgcolor="pink"  align="center">
   
         <tr>
           <td>Student Number :: </td> <td><input type="text" name="sno">  </td>
         </tr>
         <tr>
           <td>Student Name :: </td> <td><input type="text" name="sname">  </td>
         </tr>
         <tr>
           <td>Student Address :: </td> <td><input type="text" name="sadd">  </td>
         </tr>
         <tr>
           <td>Student marks Avg :: </td> <td><input type="text" name="avg">  </td>
         </tr>
         <tr>
            <td colspan="2"><input type="submit" value="Register"/>  </td>
         </tr>
   </table>
</form:form>