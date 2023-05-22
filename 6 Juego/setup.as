package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		
		private var fondo_new: fondo = new fondo();
		private var piso_new: piso = new piso();
		private var protagonista_new: protagonista= new protagonista();
		private var antagonista_new: antagonista= new antagonista();
		public function setup() {
			// constructor code
			addChild( fondo_new);
			fondo_new.y =200;
			fondo_new.x =275;
			addChild( piso_new);
			piso_new.y=335;
			piso_new.x=3;
			addChild( protagonista_new);
			protagonista_new.y=335;
			protagonista_new.x=275;
			addChild( antagonista_new);
			antagonista_new.y=120;
			antagonista_new.x=300;
		}
	}
}
