<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawSeriesChart);

    function drawSeriesChart() {

      var data1 = google.visualization.arrayToDataTable([
        ['ID', 'Eleitorado atual', 'Solucao', 'Solucao',     'Eleitorado atual'],
       ##DADOS1##
      ]);
	  
	  var data2 = google.visualization.arrayToDataTable([
        ['ID', 'Eleitorado 2021', 'Solucao', 'Solucao',     'Eleitorado 2021'],
       ##DADOS2##
      ]);

 	var data3 = google.visualization.arrayToDataTable([
        ['ID', 'Movimentacoes', 'Solucao', 'Solucao',     'Movimentacoes'],
       ##DADOS3##
      ]);
      
      var options1 = {
        title: 'Comparacao eleitorado atual',
        hAxis: {title: 'Eleitorado'},
        vAxis: {title: 'Solucao'},
        bubble: {textStyle: {fontSize: 11}}
      };
	  
	  var options2 = {
        title: 'Comparacao eleitorado 2021',
        hAxis: {title: 'Eleitorado 2021'},
        vAxis: {title: 'Solucao'},
        bubble: {textStyle: {fontSize: 11}}
      };
      
      var options3 = {
        title: 'Comparacao movimentacoes',
        hAxis: {title: 'Movimentacoes'},
        vAxis: {title: 'Solucao'},
        bubble: {textStyle: {fontSize: 11}}
      };

	  var chart1 = new google.visualization.BubbleChart(document.getElementById('chart1'));
      chart1.draw(data1, options1);
	  
	  var chart2 = new google.visualization.BubbleChart(document.getElementById('chart2'));
      chart2.draw(data2, options2);
      
      var chart3 = new google.visualization.BubbleChart(document.getElementById('chart3'));
      chart3.draw(data3, options3);
    }
    </script>
  </head>
  <body>
	<h1>Comparacao de resultados - simulador de rezoneamento<h1>
    <div id="chart1" style="width: 1500px; height: 750px;"></div>
	<div id="chart2" style="width: 1500px; height: 750px;"></div>
	<div id="chart3" style="width: 1500px; height: 750px;"></div>
  </body>
</html>