<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE html>  
<html>  
<head>  
<title>Three Column Layout</title>  
<style type="text/css">  
body {  
 font-family: Arial, Verdana, sans-serif;  
}  
  
.header,.footer,.leftPane,.rightPane {  
 border: 1px solid gray;  
}  
  
.header,.main,.footer {  
 width: 1000px;  
 color: #665544;  
 margin: 0px auto;  
 clear: both;  
}  
  
.leftPane,.rightPane {  
 float: left;  
 margin: 10px;  
 height: 500px;  
}  
  
.leftPane {  
 width: 100px;  
}  
  
.rightPane {  
 width: 856px;  
}  
  
.leftMenu {  
 list-style: none;  
 padding: 0;  
 margin: 5px;  
}  
</style>  
</head>  
<body>  
<tiles:insertAttribute name="header" />  
 <div class="main">  
  <tiles:insertAttribute name="menu" />  
  <div class="rightPane">  
   <tiles:insertAttribute name="body" />  
  </div>  
 </div>  
<tiles:insertAttribute name="footer" />  
   
</body>  
</html>  