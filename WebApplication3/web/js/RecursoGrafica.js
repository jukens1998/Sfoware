/*
 Hulk Light Theme v0.1
 FusionCharts JavaScript Library

 Copyright FusionCharts Technologies LLP
 License Information at <http://www.fusioncharts.com/license>
*/
FusionCharts.register('theme', {
	name: 'hulk-light',
	theme: {
		base: {
			chart: {
				paletteColors: "#876EA1, #72D7B2, #77BCE9, #E5B556, #F5828E, #FFDF60, #CF6E88, #B8D076, #A5A28F, #EEAF7E",
				useplotgradientcolor: "0",
				plotBorderAlpha: "0",
				bgColor: "#FFFFFFF",
				canvasBgColor: "#FFFFFF",
				showCanvasBorder: "0",
				showBorder: "0",
				divLineAlpha: "40",
				divLineColor: "#DCDCDC",
				alternateHGridColor: "#DCDCDC",
				alternateHGridAlpha: "15",
				labelDisplay: "auto",
				baseFont: "Roboto",
				baseFontColor: "#153957",
				outCnvBaseFont: "Roboto",
				outCnvBaseFontColor: "#8A8A8A",
				baseFontSize: "13",
				outCnvBaseFontSize: "13",
				labelFontColor: "#8A8A8A",
				captionFontColor: "#153957",
				captionFontBold: "1",
				captionFontSize: "20",
				subCaptionFontColor: "#153957",
				subCaptionfontSize: "17",
				subCaptionFontBold: "0",
				captionPadding: "20",
				valueFontBold: "0",
				showAxisLines: "1",
				yAxisLineColor: "#DCDCDC",
				xAxisLineColor: "#DCDCDC",
				xAxisLineAlpha: "15",
				yAxisLineAlpha: "15",
				toolTipPadding: "7",
				toolTipBorderColor: "#DCDCDC",
				toolTipBorderThickness: "0",
				toolTipBorderRadius: "2",
				showShadow: "0",
				toolTipBgColor: "#153957",
				toolTipBgAlpha: "90",
				toolTipColor: "#FFFFFF",
				legendBorderAlpha: "0",
				legendShadow: "0",
				drawCustomLegendIcon: "1",
				legendItemFontSize: "14",
			}
		},

		pie2d: {
			chart: {
				labelFontColor: null,
				useDataPlotColorForLabels: "1",
				placeValuesInside: "0",
				use3dlighting: "0",
				captionPadding: "20"
			},
			data: function(b, a, c) {
				a = window.Math;
				return {
					alpha: 100 - (50 < c ? a.round(100 / a.ceil(c / 10)) : 20) * a.floor(b / 10)
				}
			}
		},

		doughnut2d: {
			chart: {
				labelFontColor: null,
				useDataPlotColorForLabels: "1",
				placeValuesInside: "0",
				use3dlighting: "0",
				centerLabelFontSize: "13",
				centerLabelBold: "1",
				centerLabelFontColor: "#153957",
				captionPadding: "20",
				pieRadius: "100"
			},
			data: function(b, a, c) {
				a = window.Math;
				return {
					alpha: 100 - (50 < c ? a.round(100 / a.ceil(c / 10)) : 20) * a.floor(b / 10)
				}
			}
		},

		doughnut3d: {
			chart: {
				labelFontColor: null,
				useDataPlotColorForLabels: "1",
				placeValuesInside: "0",
				use3dlighting: "0",
				centerLabelFontSize: "13",
				centerLabelBold: "1",
				centerLabelFontColor: "#153957",
				captionPadding: "20",
				pieRadius: "100"
			},
			data: function(b, a, c) {
				a = window.Math;
				return {
					alpha: 100 - (50 < c ? a.round(100 / a.ceil(c / 10)) : 20) * a.floor(b / 10)
				}
			}
		},

		bar2d: {
			chart: {
				valueFontColor: "#153957",
				placeValuesInside: "1"
			}
		},

		line: {
			chart: {
				lineThickness: "2"
			}
		},

		spline: {
			chart: {
				lineThickness: "2"
			}
		},

		mscolumn3d: {
			chart: {
				showValues: "0"
			}
		},

		msstackedcolumn2dlinedy: {
			chart: {
				showValues: "0"
			}
		},

		stackedcolumn2d: {
			chart: {
				showValues: "0"
			}
		},

		msstackedcolumn2d: {
			chart: {
				showValues: "0"
			}
		},

		mscombi3d: {
			chart: {
				showValues: "0"
			}
		},

		mscombi2d: {
			chart: {
				showValues: "0"
			}
		},

		mscolumn3dlinedy: {
			chart: {
				showValues: "0"
			}
		},

		angulargauge: {
			chart: {
				gaugeFillMix: "{light+0}"
			}
		},

		stackedcolumn3dline: {
			chart: {
				showValues: "0"
			}
		},

		stackedcolumn2dline: {
			chart: {
				showValues: "0"
			}
		},

		scrollcombi2d: {
			chart: {
				showValues: "0"
			}
		},

		scrollcombidy2d: {
			chart: {
				showValues: "0"
			}
		},

		logstackedcolumn2d: {
			chart: {
				showValues: "0"
			}
		},

		logmsline: {
			chart: {
				showValues: "0"
			}
		},

		logmscolumn2d: {
			chart: {
				showValues: "0"
			}
		},

		msstackedcombidy2d: {
			chart: {
				showValues: "0"
			}
		},

		pareto2d: {
			chart: {
				showValues: "0"
			}
		},

		pareto3d: {
			chart: {
				showValues: "0"
			}
		},

		thermometer: {
			chart: {
				gaugeFillColor: "#0075c2"
			}
		},

		cylinder: {
			chart: {
				cylFillColor: "#0075c2"
			}
		},

		sparkline: {
			chart: {
				linecolor: "#0075c2"
			}
		},

		sparkcolumn: {
			chart: {
				plotFillColor: "#0075c2"
			}
		},

		sparkwinloss: {
			chart: {
				winColor: "#0075c2",
				lossColor: "#1aaf5d",
				drawColor: "#f2c500",
				scoreLessColor: "#f45b00"
			}
		},

		hbullet: {
			chart: {
				plotFillColor: "#0075c2",
				targetColor: "#1aaf5d"
			}
		},

		vbullet: {
			chart: {
				plotFillColor: "#0075c2",
				targetColor: "#1aaf5d"
			}
		},

		treemap: {
			chart: {
				baseFontSize: "10",
				outCnvBaseFontSize: "10",
				labelFontColor: "#FFFFFF",
				spacex: "0",
				spacey: "0",
				legendPadding: "10",
				horizontalPadding: "1",
				verticalPadding: "1",
				hoveronallsiblingleaves: "1",
				plotborderthickness: ".5",
				legendShadow: "1",
				legendBorderThickness: "0",
				legendScaleLineAlpha: "0",
				legendCaptionFontSize: "13",
				legendCaptionFontColor: "#888888",
				legendpadding: "0",
				plotBorderColor: "#D9D9D9",
				plotBorderThickness: "0.3",
				labelFontAlpha: "100",
				animation: "0",
				plotbordercolor: "ffffff",
				plotBorderAlpha: "30",
				chartBottomMargin: "0",
				labelGlow: "0",
				showLegend: "1",
				legendItemFontSize: "15",
				legendItemFontBold: "0",
				legendPointerWidth: "8",
				legendBgAlpha: "0",
				legendScaleLineThickness: "0",
				algorithm: "squarified",
			}
		},

		geo: {
			chart: {
				showLabels: "0",
				fillColor: "#0075C2",
				showBorder: "0",
				borderColor: "#D9D9D9",
				borderThickness: "1",
				borderAlpha: "50",
				entityFillhoverColor: "#0075C2",
				entityFillhoverAlpha: "80",
				connectorColor: "#cccccc",
				connectorThickness: "1.5",
				markerFillHoverAlpha: "90",
				legendBgColor: "#FFFFFF",
				legendScaleLineAlpha: "0"
			}
		}
	}
});