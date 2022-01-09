<html>
    <head></head>
    <body>
        <%  
            int p = Integer.parseInt(request.getParameter("Principle"));
            int r = Integer.parseInt(request.getParameter("Rate"));
            int t = Integer.parseInt(request.getParameter("Time"));
            out.print("Interest is: "+(p*t*r/100)+"<br>");  
        %>
    </body>
</html>

