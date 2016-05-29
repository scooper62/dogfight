package jpu2016.dogfight.controller;

import jpu2016.dogfight.view.DogfightView;
import jpu2016.dogfight.view.IViewSystem;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightController {

	public static void main(String[] args) {
		
		int TIME_SLEEP = 30;

		public final DogfightController(IDogfightModel dogfightModel);
		

		public void orderPerform(UserOrder userOrder) {

		}

		public void play() {

		}

		public void setViewSystem(IViewSystem viewSystem) {

		}

		private void launchMissile(int player) {

		}

		private void gameLoop() {

		}
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();

	}

}
