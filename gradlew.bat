t(n){if(l&&l.n){var t="data-template-name";if(n)l.n=n,c.setAttribute(ht,JSON.stringify(l)),c.setAttribute(t,n);else return c.getAttribute(t)||l.n}}function it(n){var t=nt[n];return t&&t.clone()}var o=this,rt=t&&t.renderSettings,b,ut,ft,ot,st,tt,y,l,ht="data-m",lt,et,c;o.column=f;o.renderColumn=0;o.renderRow=0;o.renderTemplates=vt(i);o.canSpanBlocks=function(){return e};o.isValid=function(){return tt};o.setRenderInfo=function(n,t,i){y={width:n.width,height:n.height};lt=n.css;ut=n.img;et=n.name;o.renderColumn=t||0;o.renderRow=i||0};o.render=function(t,i){if(!n)return y;if(ot&&(at(),c&&(b&&ut&&ft&&(s.pub(h.imgLoadingEvent,b),b.setAttribute("src",ft+ut)),pt())),y.width&&y.height){var r="top:"+rt.getVerticalRenderValue(i+o.renderRow,!0)+";"+u.left+":"+rt.getHorizontalRenderValue(t+o.renderColumn,!0);n.style.cssText=r;n.classList.add("show")}return y}}function a(n,t,i,r,u){var f=this;f.name=n;f.css=t;f.width=i;f.height=r;f.img=u;f.clone=function(){return new a(f.name,f.css,f.width,f.height,f.img)}}function et(n){this.renderSettings=n.renderSettings||new tt}function tt(t){function r(n,i,r){var u=i*n;return r&&(u=Math.round(u*10)/10+t.physicalUnit),u}function u(n,t){return n/t}var i=this;t=n.extend({},{physicalUnit:"rem",columnUnitSize:30,rowUnitSize:18.7,columnSpacing:0,blockSpacing:0},t);i.unitValues={columnSpacing:u(t.columnSpacing,t.columnUnitSize),blockSpacing:u(t.blockSpacing,t.rowUnitSize)};i.getHorizontalRenderValue=function(n,i){return r(n,t.columnUnitSize,i)};i.getVerticalRenderValue=function(n,i){return r(n,t.rowUnitSize,i)}}function ot(n,t,i,r){var f,u;for(t=t||0,i=i!=null?i:n.length,f=Math.min(t+i,n.length)-1,u=t;u<=f;u++)r(n[u],u)}function b(n,t){var i={errId:n.errId,errMsg:n.errMsg+JSON.stringify(t),errSource:n.errSource};c.trackAppErrorEvent(i)}var k="RiverCard1uDoubleWide",p="RiverCardContent360Half",d="SponsoredRiverCard1uDoubleWide",w="RiverCardHalfHeight",g=1,it=[new a(k,"rcdw",2,2),new a(d,"rcdw",2,2),new a("RiverCardTallPortrait","rctpp",1,4),new a("RiverCardPortrait","rcpp",1,3),new a("RiverCardPhotoLarge","rcpl",1,3),new a("RiverCardPhoto","rcp",1,2),new a("RiverCardCompact","rcc",1,2),new a(w,"rch",1,1),new a("RiverCardHalfHeightImage","rchi",1,1),new a("RiverCardContent360DoubleWide","rcdw",2,2),new a("