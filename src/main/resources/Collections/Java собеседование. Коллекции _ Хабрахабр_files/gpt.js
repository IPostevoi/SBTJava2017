(function(){var window=this;var d=this,e=function(){},aa=function(a){var b=typeof a;if("object"==b)if(a){if(a instanceof Array)return"array";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if("[object Window]"==c)return"object";if("[object Array]"==c||"number"==typeof a.length&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("splice"))return"array";if("[object Function]"==c||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("call"))return"function"}else return"null";else if("function"==b&&"undefined"==typeof a.call)return"object";return b};var g=function(){this.a="";this.b=ba};g.prototype.u=!0;g.prototype.l=function(){return this.a};var ca=function(a){return a instanceof g&&a.constructor===g&&a.b===ba?a.a:"type_error:TrustedResourceUrl"},ba={},da=function(a){var b=new g;b.a=a;return b};var k=function(){this.m="";this.v=ea};k.prototype.u=!0;k.prototype.l=function(){return this.m};var fa=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,ea={},ha=function(a){var b=new k;b.m=a;return b};ha("about:blank");var m;a:{var ia=d.navigator;if(ia){var ja=ia.userAgent;if(ja){m=ja;break a}}m=""};var p=function(a){p[" "](a);return a};p[" "]=e;var q=function(){return d.googletag||(d.googletag={})};var r={1:"pagead2.googlesyndication.com",2:"pubads.g.doubleclick.net",3:"securepubads.g.doubleclick.net",7:.02,10:0,13:1500,16:.01,17:1,20:0,23:.001,24:200,27:.01,28:0,29:.01,33:"pagead2.googlesyndication.com",34:1,37:.01,38:.001,47:1E-4,53:"",54:0,57:.05,58:1,159:1,60:0,63:0,65:.01,66:1E-5,67:0,68:0,69:.99,71:.05,73:.001,74:.05,75:"",161:.05,162:20170920,163:"",76:"",77:.001,78:.01,88:1,79:.95,81:.001,83:1E-4,84:0,85:.01,87:.2,89:.995,90:.01,91:.01,92:0,93:0,94:0,95:0,96:.995,97:.001,98:0,99:.01,101:.001,103:.01,104:"/pagead/js/rum.js",105:.001,106:"1-0-12",107:"1-0-10",110:.001,113:1,114:.01,115:.01,116:.001,117:.01,118:.05,123:.01,120:.05,121:.001,124:.05,122:.001,125:.01,126:.01,127:.001,129:.01,130:1,131:"",132:.01,156:0,133:0,134:.01,135:0,136:1,137:0,138:"",143:.001,144:.001,141:1,145:1,151:.01,157:0,158:0,150:"",153:.05,154:1,155:0,160:"",152:[]};r[6]=function(a,b){try{for(var c=null;c!=a;c=a,a=a.parent)switch(a.location.protocol){case "https:":return!0;case "file:":return!!b;case "http:":return!1}}catch(f){}return!0}(window);r[49]=(new Date).getTime();r[36]=/^true$/.test(!1);r[46]=/^true$/.test(!1);r[148]=/^true$/.test(!1);var t=function(){var a={},b;for(b in r)a[b]=r[b];this.a=a};t.prototype.get=function(a){return this.a[a]};t.prototype.set=function(a,b){this.a[a]=b};t.b=void 0;t.a=function(){return t.b?t.b:t.b=new t};var ka=["21060621","21060622","21060833","21060713"],la=t.a().a,ma=q(),na=ma._vars_,u;for(u in na)la[u]=na[u];ma._vars_=la;var oa=function(){return"156"},pa=q();pa.hasOwnProperty("getVersion")||(pa.getVersion=oa);var qa=function(){var a=e;return function(){if(a){var b=a;a=null;b()}}};var ra=function(a,b){a.addEventListener?a.addEventListener("message",b,void 0):a.attachEvent&&a.attachEvent("onmessage",b)};var ta=function(){var a=d;this.b=a=void 0===a?d:a;this.w="https://securepubads.g.doubleclick.net/static/3p_cookie.html";this.a=2;this.f=[];this.s=!1;a:{var b=[d.top];a=[];for(var c=0,f;f=b[c++];){a.push(f);try{if(f.frames)for(var h=f.frames.length,n=0;n<h&&50>b.length;++n)b.push(f.frames[n])}catch(H){}}b:{try{var w=d.parent;if(w&&w!=d){var l=w;break b}}catch(H){}l=null}(h=l)&&a.unshift(h);a.unshift(d);var W;for(h=0;h<a.length;++h)try{var z=a[h],wa=v(z);if(wa){this.a=sa(wa);if(2!=this.a)break a;var J;if(J=!W){l=void 0;try{if(l=!!z&&null!=z.location.href)c:{try{p(z.foo);l=!0;break c}catch(H){}l=!1}J=l}catch(H){J=!1}}J&&(W=z)}}catch(H){}this.b=W||this.b}},x=function(a){if(2!=ua(a)){for(var b=1==ua(a),c=0;c<a.f.length;c++)try{a.f[c](b)}catch(f){}a.f=[]}},va=function(a){var b=v(a.b);b&&2==a.a&&(a.a=sa(b))},ua=function(a){va(a);return a.a},xa=function(a){var b=y;b.f.push(a);if(2!=b.a)x(b);else if(b.s||(ra(b.b,function(a){var c=v(b.b);if(c&&a.source==c&&2==b.a){switch(a.data){case "3p_cookie_yes":b.a=1;break;case "3p_cookie_no":b.a=0}x(b)}}),b.s=!0),v(b.b))x(b);else{a=b.b.document.createElement("iframe");a.src=b.w;a.name="detect_3p_cookie";a.style.visibility="hidden";a.style.height="0";a.onload=function(){va(b);x(b)};try{b.b.document.body.appendChild(a)}catch(c){}}},ya=function(a,b){try{return!!a.frames[b]}catch(c){return!1}},v=function(a){return a.frames[p("detect_3p_cookie")]||null},sa=function(a){return ya(a,"3p_cookie_yes")?1:ya(a,"3p_cookie_no")?0:2};var A=null;var za=function(a,b){var c="script";c=void 0===c?"":c;var f=a.createElement("link");f.rel="preload";b instanceof g?b=ca(b):b instanceof k?b=b instanceof k&&b.constructor===k&&b.v===ea?b.m:"type_error:SafeUrl":(b instanceof k||(b=b.u?b.l():String(b),fa.test(b)||(b="about:invalid#zClosurez"),b=ha(b)),b=b.l());f.href=b;c&&(f.as=c);(a=a.getElementsByTagName("head")[0])&&a.appendChild(f)};var Aa=/^\.google\.(com?\.)?[a-z]{2,3}$/,Ba=/\.(cn|com\.bi|do|sl)$/,B=function(a){return Aa.test(a)&&!Ba.test(a)},C=d,y,Ca=function(a){a="https://adservice"+D[1]+(D[3]?"/generate_204":"/adsid/integrator."+a);var b=["domain="+encodeURIComponent(d.location.hostname)];E[3]>=+new Date&&b.push("adsid="+encodeURIComponent(E[1]));return a+"?"+b.join("&")},E,D,F=function(){C=d;E=C.googleToken=C.googleToken||{};var a=+new Date;E[1]&&E[3]>a&&0<E[2]||(E[1]="",E[2]=-1,E[3]=-1,E[4]="");D=C.googleIMState=C.googleIMState||{};B(D[1])||(D[1]=".google.com");"boolean"==typeof D[3]||(D[3]=!1);"boolean"==typeof D[4]||(D[4]=!1);"array"==aa(D[5])||(D[5]=[]);"boolean"==typeof D[6]||(D[6]=!1);"array"==aa(D[7])||(D[7]=[])},Da=function(a){try{a()}catch(b){d.setTimeout(function(){throw b;},0)}},Fa=function(a){"complete"==d.document.readyState||"loaded"==d.document.readyState||d.currentScript&&d.currentScript.async?Ea(3):a()},Ga=0,Ha=0,G={j:function(){return D[4]},g:function(a){D[4]=a},c:e,i:function(){return D[5]},o:function(){return 2>=++Ga},h:Da},I={j:function(){return D[6]},g:function(a){D[6]=a},c:e,i:function(){return D[7]},o:function(){return 2>=++Ha},h:function(a){Fa(function(){Da(a)})}},Ea=function(a){if(1E-5>Math.random()){d.google_image_requests||(d.google_image_requests=[]);var b=d.document.createElement("img");b.src="https://pagead2.googlesyndication.com/pagead/gen_204?id=imerr&err="+a;d.google_image_requests.push(b)}};G.c=function(){if(!G.j()){G.g(!0);var a=d.document,b=Ca("js");za(a,b);var c=a.createElement("script");c.type="text/javascript";c.onerror=function(){return d.processGoogleToken({},2)};D[3]&&(c.onload=function(){var a={};return d.processGoogleToken((a.newToken="FBA",a),4)});b=da(b);c.src=ca(b);try{(a.head||a.body||a.documentElement).appendChild(c)}catch(f){}d.setTimeout(function(){return d.processGoogleToken({},1)},1E3)}};I.c=function(){if(!I.j()){I.g(!0);var a=d.document,b=Ca("sync.js");za(a,b);b=b.replace(/[\W]/g,function(a){return"&#"+a.charCodeAt()+";"});var c=p("script"),f="<"+c+' src="'+b+'"></'+c+">"+("<"+c+'>processGoogleTokenSync({"newToken":"FBS"},5);</'+c+">");Fa(function(){a.write(f)})}};var Ia=function(a,b){F();var c=C.googleToken[5]||0;a&&(0!=c||E[3]>=+new Date?b.h(a):(b.i().push(a),b.c()));E[3]>=+new Date&&E[2]>=+new Date||b.c()},Ka=function(a){d.processGoogleToken=d.processGoogleToken||function(a,c){return Ja(G,a,c)};Ia(a,G)},La=function(a){d.processGoogleTokenSync=d.processGoogleTokenSync||function(a,c){return Ja(I,a,c)};Ia(a,I)},Ma=function(a){y=y||new ta;xa(function(b){b&&a()})},Ja=function(a,b,c){b=void 0===b?{}:b;c=void 0===c?0:c;var f=b.newToken||"",h=b.altDomain||"",n=parseInt(b.freshLifetimeSecs||"",10)||3600,w=parseInt(b.validLifetimeSecs||"",10)||86400;b=b["1p_jar"]||"";F();a.g(!1);Ea(c);if(!f&&h&&Aa.test(h)&&a.o())B(h)&&(D[1]=h),a.c();else{h=C.googleToken=C.googleToken||{};var l=!(E[3]>=+new Date)&&(5==c||4==c||2==c);if(0==c&&f&&"string"==typeof f&&0<n&&0<w&&"string"==typeof b||l)l=+new Date,h[5]=c,h[1]=f,h[2]=l+1E3*n,h[3]=l+1E3*w,h[4]=b,F();c=a.i();for(f=0;f<c.length;f++)a.h(c[f]);c.length=0}};p("partner.googleadservices.com");p("www.googletagservices.com");var K="",Na="",Oa=null,Pa=t.a().get(46)&&!t.a().get(6);K=Pa?"http:":"https:";Na=t.a().get(Pa?2:3);var Qa=function(a,b){if(null===A){A="";try{var c=d.top.location.hash;if(c){var f=c.match(/\bdeid=([\d,]+)/);A=f?f[1]:""}}catch(n){}}if(c=(c=A)&&c.match(new RegExp("\\b("+a.join("|")+")\\b")))a=c[0];else if(b)a:{if(!(1E-4>Math.random())&&(c=Math.random(),c<a.length*b)){try{var h=new Uint32Array(1);d.crypto.getRandomValues(h);c=h[0]/65536/65536}catch(n){c=Math.random()}a=a[Math.floor(c*a.length)];break a}a=null}else a=null;return a};var L=q(),M=L.fifWin||window,N=M.document,Ra=[],Sa=q();Sa.hasOwnProperty("cmd")||(Sa.cmd=Ra);if(L.evalScripts)L.evalScripts();else{var Ta=N.currentScript,Ua;var O=t.a(),P=O.get(76);if(P)Ua=P;else{var Q="151 151 153 154 155 156".split(" "),Va=Q[0]||"156",Wa=O.get(131),R="",S,Xa=!1;if(Wa)R="?eid="+Wa,S="156";else if(1<Q.length&&-1==m.indexOf("Google Web Preview")){var T="21061099 21061100 21061101 21061102 21061103 21061104".split(" "),U=Qa(T,.01);if(U)if(Xa=!0,t.a().set(53,U),U==T[0])R="?v="+Q[T.length-1];else for(var V=1;V<T.length;++V)if(U==T[V]){S=Q[V];break}}S=S||Va;var Ya="/gpt/pubads_impl_";if(!Xa&&!Wa){var Za;var $a=t.a().get(161),X=Qa(["21061063","21061064","21061065"],$a);X?(Oa=X,t.a().get(152).push(X),t.a().set(163,X),Za="21061064"==X||"21061065"==X?"/gpt/pubads_impl_core_":"/gpt/pubads_impl_control_"):Za=null;var ab=Za;ab&&(Ya=ab,S=O.get(162),R="?cb="+O.get(163))}P=K+"//"+Na+Ya+S+".js"+R;t.a().set(76,P);Ua=P}var bb=Ua,cb="21061065"===Oa,db=cb?K+"//"+Na+"/gpt/pubads_impl_rendering_"+t.a().get(162)+".js?cb="+t.a().get(163):"";-1!=m.indexOf("iPhone")&&t.a().set(79,0);var eb=t.a().get(160);eb&&t.a().get(152).push(eb);var fb=t.a().get(148)?t.a().get(137):0,Y=t.a().get(138)||Qa(ka,fb);if(Y)try{var gb=t.a().get(150);gb&&(F(),B(gb)&&(D[1]=gb));t.a().set(138,Y)}catch(a){}var hb=M.performance;if(hb&&hb.now){var ib=hb.now();(M.google_js_reporting_queue=M.google_js_reporting_queue||[]).push({label:"1",type:9,value:ib,uniqueId:"rt."+Math.random()})}if(!("complete"==N.readyState||"loaded"==N.readyState||Ta&&Ta.async)){var jb="gpt-impl-"+Math.random();try{var kb='<script id="'+jb+'" src="'+bb+'">\x3c/script>';cb&&(kb+='<link rel="preload" href="'+db+'" as="script">');N.write(kb);L._syncTagged_=!0}catch(a){}if(N.getElementById(jb))switch(L._loadStarted_=!0,Y){case "21060833":var lb=qa();Ma(lb);La(lb);break;case "21060622":case "21060713":La(null)}}if(!L._loadStarted_){switch(Y){case "21060833":var mb=qa();Ma(mb);Ka(mb);break;case "21060622":case "21060713":Ka(null)}var nb=N.createElement("script");nb.src=bb;nb.async=!0;var ob=N.head||N.body||N.documentElement;ob.appendChild(nb);if(cb){var Z=N.createElement("link");Z.rel="preload";Z.href=db;Z.as="script";ob.appendChild(Z)}L._loadStarted_=!0}};}).call(this.googletag&&googletag.fifWin?googletag.fifWin.parent:this)
