package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.sampler.NewObjectSample;
	
	public class setup extends MovieClip {
		
		private var fondo_new: fondo = new fondo();
		private var piso_new: piso = new piso();
		static var protagonista_new: protagonista= new protagonista();
		private var antagonista_new: antagonista= new antagonista();
		static var puntos: Number=0;
		static var puntos_box_new: puntos_box= new puntos_box();
		public function setup() {
			// constructor code
			addChild( fondo_new);
			fondo_new.y =200;
			fondo_new.x =275;
			
			addChild( piso_new);
			piso_new.y=335;
			piso_new.x=3;
			
			addChild( protagonista_new);
			protagonista_new.y=365;
			protagonista_new.x=275;
			
			addChild( antagonista_new);
			antagonista_new.y=80;
			antagonista_new.x=300;
			
			addChild( puntos_box_new);
			puntos_box_new.y=10;
			puntos_box_new.x=120;
			puntos_box_new.puntostxt.text= String(puntos);
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
		}
			public function actualiza_puntos(e:Event){
			puntos_box_new.puntostxt.text= String(puntos);
			}
	}
}
