package test.ui {
	import gear.core.Game;
	import gear.net.LibData;
	import gear.net.SWFLoader;
	import gear.ui.cell.GListCell;
	import gear.ui.cell.LabelSource;
	import gear.ui.controls.GGrid;
	import gear.ui.data.GGridData;

	import flash.events.Event;

	/**
	 * @author bright
	 * @version 20111120
	 */
	[SWF(width=550,height=400,backgroundColor=0x333333,frameRate="30")]
	public class TestGGrid extends Game {
		private var _grid : GGrid;

		override protected function startup() : void {
			_res.add(new SWFLoader(new LibData("ui/ui.swf", "ui")));
			_res.addEventListener(Event.COMPLETE, res_complateHandler);
			_res.load();
		}

		private function res_complateHandler(event : Event) : void {
			addGrid();
		}

		protected function addGrid() : void {
			var data : GGridData = new GGridData();
			data.bgSkin = null;
			data.x = data.y = 10;
			data.hgap = data.vgap = 5;
			data.cellData.width = 44;
			data.cellData.height = 44;
			data.cell = GListCell;
			_grid = new GGrid(data);
			_grid.model.allowNull = false;
			addChild(_grid);
			_grid.model.add(new LabelSource("A"));
			_grid.model.add(new LabelSource("B"));
			_grid.model.removeAt(0);
			//_grid.model.add(new LabelSource("C"));
		}
	}
}
