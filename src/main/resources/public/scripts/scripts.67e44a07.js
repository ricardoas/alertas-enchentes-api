"use strict";function routeConfig(a,b){a.state("home",{url:"/",templateUrl:"views/main.html"}).state("riobranco",{url:"/riobranco",templateUrl:"views/riobranco.html",controller:"RioBrancoCtrl",controllerAs:"ctrl"}).state("portovelho",{url:"/portovelho",templateUrl:"views/portovelho.html"}).state("manaus",{url:"/manaus",templateUrl:"views/manaus.html"}),b.otherwise("/")}angular.module("alertasEnchentesApp",["ngAnimate","ngSanitize","ngTouch","ui.router"]).constant("RESTAPI",{url:"http://localhost:5003/api"}).config(routeConfig),routeConfig.$inject=["$stateProvider","$urlRouterProvider"],angular.module("alertasEnchentesApp").controller("MainCtrl",function(){var a=function(){var a=new Date,b=a.getHours();a.getMinutes();return" "+b+":00"};this.now=a()}),function(){function a(){var a=this;a.river="Rio Branco",a.history=[{date:"Jan 2000",price:"1200"},{date:"Fev 2000",price:"1300.46"},{date:"Mar 2000",price:"1400.46"},{date:"Abr 2000",price:"1500.46"},{date:"Mai 2000",price:"1320.46"},{date:"Jun 2000",price:"1394.46"}]}angular.module("alertasEnchentesApp").controller("RioBrancoCtrl",a),a.$inject=[]}(),function(){function a(a){return{template:"<svg></svg>",restrict:"E",scope:{history:"="},link:function(a,b){function c(a){return a.date=j(a.date),a.price=+a.price,a}var d=d3,e={top:10,right:10,bottom:100,left:40},f={top:430,right:10,bottom:20,left:40},g=1960-e.left-e.right,h=500-e.top-e.bottom,i=500-f.top-f.bottom,j=d.time.format("%d/%m/%Y").parse,k=d3.bisector(function(a){return a.date}).left,l=d.time.scale().range([0,g]),m=d.time.scale().range([0,g]),n=d.scale.linear().range([h,0]),o=d.scale.linear().range([i,0]),p=d.svg.axis().scale(l).orient("bottom"),q=d.svg.axis().scale(m).orient("bottom"),r=d.svg.axis().scale(n).orient("left").innerTickSize(-g).outerTickSize(0).tickPadding(10),s=d.svg.brush().x(m),t=d.svg.area().interpolate("monotone").x(function(a){return l(a.date)}).y0(h).y1(function(a){return n(a.price)}),u=d.svg.area().interpolate("monotone").x(function(a){return m(a.date)}).y0(i).y1(function(a){return o(a.price)}),v=d.select("svg").attr({class:"timeline-chart",version:"1.1",viewBox:"0 0 "+(g+e.left+e.right)+" "+(h+e.top+e.bottom),width:"100%"});v.append("defs").append("clipPath").attr("id","clip").append("rect").attr("width",g).attr("height",h);var w=v.append("g").attr("class","focus").attr("transform","translate("+e.left+","+e.top+")"),x=w.append("path").attr("class","area"),y=w.append("rect").attr("width",g).attr("height",h).style("fill","none").style("pointer-events","all"),z=w.append("g").attr("class","selected-value").style("display","none"),A=z.append("line"),B=z.append("circle").attr("r",6),C=z.append("text").attr("x",9).attr("dy",".35em"),D=v.append("g").attr("class","context").attr("transform","translate("+f.left+","+f.top+")");d.csv("population.csv",c,function(a,b){function c(){l.domain(s.empty()?m.domain():s.extent()),w.select(".area").attr("d",t(b)),w.select(".x.axis").call(p)}function e(){z.style("display",null)}function f(){z.style("display","none")}function j(){var a=l.invert(d.mouse(this)[0]),c=k(b,a,1),e=b[c-1],f=b[c],g=a-e.date>f.date-a?f:e;B.attr("transform","translate("+l(g.date)+","+n(g.price)+")"),A.attr({x1:l(g.date),y1:n(v),x2:l(g.date),y2:n(0)}),C.attr("transform","translate("+l(g.date)+","+n(g.price)+")"),C.text(g.price)}var v=d.max(b.map(function(a){return a.price})),E=d.extent(b.map(function(a){return a.date}));l.domain(E),n.domain([0,v]),m.domain(l.domain()),o.domain(n.domain()),x.attr("d",t(b)),w.append("line").attr("class","warning-line").attr({x1:0,y1:n(1350),x2:g,y2:n(1350)}),w.append("g").attr("class","x axis").attr("transform","translate(0,"+h+")").call(p),w.append("g").attr("class","y axis").call(r),D.append("path").datum(b).attr("class","area2").attr("d",u),D.append("g").attr("class","x axis").attr("transform","translate(0,"+i+")").call(q),D.append("g").attr("class","x brush").call(s).selectAll("rect").attr("y",-6).attr("height",i+7),y.on("mouseover",e).on("mouseout",f).on("mousemove",j),s.extent(E),s.on("brush",c)})}}}angular.module("alertasEnchentesApp").directive("aeHistory",a),a.$inject=["$window"]}(),angular.module("alertasEnchentesApp").run(["$templateCache",function(a){a.put("views/about.html","<p>This is the about view.</p>"),a.put("views/main.html",'<section class="section-header"> <div class="container inner section-header-lg"> <header class="main-header text-center"> <h1>Alerta de enchentes</h1> <p class="main-header-subheadding">Veja as previsões de volume para os rios da região amazônica</p> </header> <div class="row"> <div class="col-sm-4"> <a ui-sref="riobranco" class="river-cover river-cover-riobranco"> <span class="river-cover-inner">Rio Branco</span> </a> </div> <div class="col-sm-4"> <a ui-sref="portovelho" class="river-cover river-cover-portovelho"> <span class="river-cover-inner">Porto Velho</span> </a> </div> <div class="col-sm-4"> <a ui-sref="manaus" class="river-cover river-cover-manaus"> <span class="river-cover-inner">Manaus</span> </a> </div> </div> </div> </section> <section class="section-primary"> <div class="container"> <h2 class="text-center">Sobre o projeto</h2> <p>O Sistema de Monitoramento de Seca e Enchentes de Manaus, Rio Branco e Porto Velho é um projeto piloto do InfoAmazonia que tem o objetivo de coletar dados hidrológicos, enviar alertas, produzir e distribuir notícias sobre os impactos das mudanças climáticas nos rios da Amazônia.</p> <p>O projeto responder à necessidade de informação clara, de fácil entendimento das pessoas que sofrem impacto direto das enchentes e secas da falta de políticas públicas que promovam adaptação e mitigação das mudanças do clima.</p> </div> </section>'),a.put("views/manaus.html",'<section class="section-header"> <div class="container inner"> <header> <h1>Alerta de enchentes</h1> <p>Veja as previsões de volume para os rios da região amazônica</p> </header> <div class="row"> <div class="col-md-4"> <h2 class="major">Manaus</h2> </div> </div> </div> </section>'),a.put("views/portovelho.html",'<section class="section-header"> <div class="container inner"> <header> <h1>Alerta de enchentes</h1> <p>Veja as previsões de volume para os rios da região amazônica</p> </header> <div class="row"> <div class="col-md-4"> <h2 class="major">Porto Velho</h2> <p>Observando as medições do volume das estações Abunã, Morada Nova e Guajará Mirim, podemos antecipar as enchentes em Porto Velho e região.</p> </div> <div class="col-md-8"> <div data-alerta-enchentes-station="15400000"></div> <script type="text/javascript">(function() {\n              var script = document.createElement(\'script\');\n              script.async = true;\n              script.src   = "http://alertas-enchentes-api.herokuapp.com/scripts/alerta-enchentes.js";\n              var entry = document.getElementsByTagName(\'script\')[0];\n              entry.parentNode.insertBefore(script, entry);\n          }());</script> </div> </div> </div> </section>'),a.put("views/riobranco.html",'<section class="section-header"> <div class="container inner"> <header> <h1>Alerta de enchentes</h1> <p>Veja as previsões de volume para os rios da região amazônica</p> </header> <div class="row"> <div class="col-md-4"> <h2 class="major">Rio Branco</h2> <p>Observando as medições do volume da estação Xapuri, podemos antecipar as enchentes em Rio Branco e região.</p> </div> <div class="col-md-8"> <div data-alerta-enchentes-station="13600002"></div> <script type="text/javascript">(function() {\n              var script = document.createElement(\'script\');\n              script.async = true;\n              script.src   = "http://alertas-enchentes-api.herokuapp.com/scripts/alerta-enchentes.js";\n              var entry = document.getElementsByTagName(\'script\')[0];\n              entry.parentNode.insertBefore(script, entry);\n          }());</script> </div> </div> </div> </section> <section class="section-primary"> <div class="container-fluid"> <h2 class="text-center">Série histórica</h2> <ae-history history="ctrl.history"></ae-history> </div> </section>')}]);