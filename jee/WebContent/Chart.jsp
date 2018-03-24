
     <!DOCTYPE html>
    <html>
    <head>
        <title>Google Chart with jsp Mysql Json</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">
            var queryObject="";
            var queryObjectLen="";
            $.ajax({
                type : 'POST',
                url : 'ChartServlet',
                dataType:'json',
                success : function(result) {
                	queryObject=result;

                   
                }
                
            });
            google.load("visualization", "1", {packages:["corechart"]});
            google.setOnLoadCallback(drawChart);
            alert(queryObject);

            function drawChart() {
           var data = new google.visualization.DataTable();
                data.addColumn('string', 'Name');
                data.addColumn('number', 'Quantite');
                var dataArray=[];
                $.each(queryObject ,function(i,obj){
                	dataArray.push([obj.nom,obj.quantite]);
                });
             	data.addRows(dataArray);
                var options = {
                    title: 'Produit ',
                };
  var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));

 chart.draw(data,options);
 }
        </script>
        </head>
        <body>
              <div id="chart_div" style="width: 50%; height: 500px;"></div>
         </body>
        </html>