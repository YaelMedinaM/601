package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.sampler.NewObjectSample;
	
	public class setup2 extends MovieClip {


	private var fondo_new: fondo = new fondo();
		static var protagonista_new: protagonista= new protagonista();
		private var antagonista_new: antagonista= new antagonista();
		static var puntos: Number=0;
		
		public function setup2() {
			addChild( fondo_new);
			fondo_new.y =200;
			fondo_new.x =275;
			
			addChild( protagonista_new);
			protagonista_new.y=365;
			protagonista_new.x=275;
			
			addChild( antagonista_new);
			antagonista_new.y=80;
			antagonista_new.x=300;
		
		}

	}
	
}
