/*
 Template Name: Opatix - Admin & Dashboard Template
 Author: Myra Studio
 File: Morris
*/


$(function () {
    "use strict";
    if ($("#morris-line-example").length && Morris.Line({
        element: "morris-line-example",
        gridLineColor: "#eef0f2",
        lineColors: ["#9b94da", "#574bd6"],
        data: [{y: "2013", a: 80, b: 100}, {y: "2014", a: 110, b: 130}, {y: "2015", a: 90, b: 110}, {
            y: "2016",
            a: 120,
            b: 140
        }, {y: "2017", a: 110, b: 125}, {y: "2018", a: 170, b: 190}, {y: "2019", a: 120, b: 140}],
        xkey: "y",
        ykeys: ["a", "b"],
        hideHover: "auto",
        resize: !0,
        labels: ["Series A", "Series B"]
    }), $("#morris-area-example").length && Morris.Area({
        element: "morris-area-example",
        lineColors: ["#9b94da", "#6d61ea"],
        data: [{y: "2013", a: 80, b: 100}, {y: "2014", a: 110, b: 130}, {y: "2015", a: 90, b: 110}, {
            y: "2016",
            a: 120,
            b: 140
        }, {y: "2017", a: 110, b: 125}, {y: "2018", a: 170, b: 190}, {y: "2019", a: 120, b: 140}],
        xkey: "y",
        ykeys: ["a", "b"],
        hideHover: "auto",
        gridLineColor: "#eef0f2",
        resize: !0,
        labels: ["Series A", "Series B"]
    }), $("#morris-bar-example").length && Morris.Bar({
        element: "morris-bar-example",
        barColors: ["#c5bff5", "#877de8"],
        data: [{y: "2013", a: 80, b: 100}, {y: "2014", a: 110, b: 130}, {y: "2015", a: 90, b: 110}, {
            y: "2016",
            a: 120,
            b: 140
        }, {y: "2017", a: 110, b: 125}, {y: "2018", a: 170, b: 190}, {y: "2019", a: 120, b: 140}],
        xkey: "y",
        ykeys: ["a", "b"],
        hideHover: "auto",
        gridLineColor: "#eef0f2",
        resize: !0,
        barSizeRatio: .4,
        labels: ["Series A", "Series B"]
    }), $("#morris-donut-example").length && Morris.Donut({
        element: "morris-donut-example",
        resize: !0,
        colors: ["#574bd6", "#877de8", "#c5bff5"],
        data: [{label: "Samsung Company", value: 12}, {label: "Apple Company", value: 30}, {
            label: "Vivo Mobiles",
            value: 20
        }]
    }), $("#line-chart-updating").length) {
        var e = 0;

        function a(e) {
            for (var a = [], r = 0; r <= 360; r += 10) {
                var i = (e + r) % 360;
                a.push({x: r, y: Math.sin(Math.PI * i / 180).toFixed(4), z: Math.cos(Math.PI * i / 180).toFixed(4)})
            }
            return a
        }

        var r = Morris.Line({
            element: "line-chart-updating",
            data: a(0),
            xkey: "x",
            ykeys: ["y", "z"],
            labels: ["Apple", "Samsung"],
            parseTime: !1,
            ymin: -1,
            ymax: 1,
            hideHover: !0,
            lineColors: ["#c5bff5", "#6d61ea"],
            resize: !0
        });
        setInterval(function () {
            e++, r.setData(a(5 * e)), $("#reloadStatus").text(e + " reloads")
        }, 100)
    }
});