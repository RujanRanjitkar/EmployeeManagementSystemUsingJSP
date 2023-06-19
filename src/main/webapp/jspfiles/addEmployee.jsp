<%@ page import="com.example.jsp.dao.EmployeeDao" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.Arrays" %>
<jsp:useBean id="u" class="com.example.jsp.bean.Employee"></jsp:useBean>
<jsp:setProperty name="u" property="*"></jsp:setProperty>

<html>
    <head>

    </head>
    <body>
    <%
        //String hobbies[]= request.getParameterValues("hobbies");
        String hobbies[]=request.getParameterValues("hobbies");
        System.out.println(Arrays.toString(hobbies));
        String hobby="";
        for (int j=0;j< hobbies.length;j++){
            hobby+=hobbies[j]+" ";
        }
        u.setHobbies(hobby);
        // Get the input stream for the uploaded file
//        Part filePart = request.getPart("photo");
//        String fileName = filePart.getSubmittedFileName();
//        InputStream inputStream = filePart.getInputStream();
//        System.out.println(request.getParameter("photo"));
//
//        // Set the filename and insert the employee data into the database
//        u.setPhoto_filename(fileName);
//        int status= EmployeeDao.insertEmployee(u, inputStream);
//        if(status>0)
//            response.sendRedirect("addEmployeeSuccessfully.jsp");
//        else
//            response.sendRedirect("addEmployee-Error.jsp");
    %>
    </body>
</html>