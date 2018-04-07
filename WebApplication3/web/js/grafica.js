FusionCharts.ready(function() {
  var oilResChart = new FusionCharts({
    type: 'column2d',
    renderAt: 'chart-container',
    width: '100%',
    height: '400',
    dataFormat: 'json',
    dataSource: {
      "chart": {
        "caption": "CANDIDATOS PRESIDENCIALES",
        "subCaption":"[2018]",
        "xAxisName": "Candidatos",
        "yAxisName": "Canditad de Votos",
        // extra attributes  
        "numberSuffix": "K",
        "showValues": "0",
        "paletteColors": "#2abb9c", 
        "showHoverEffect": "1",
        "use3DLighting": "0",
        "showaxislines": "1",
        "theme": "hulk-light",
      },
      "data": [{
        "label": "Alejandro Vargas",
        "value": "290"
      }, {
        "label": "Gustavo Duque",
        "value": "260"
      }, {
        "label": "Ivan Fajardo",
        "value": "180"
      }, {
        "label": "Martha Lopez",
        "value": "140"
      }]
    }
  }).render();
});