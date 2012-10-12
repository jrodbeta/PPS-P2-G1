package hoop.g1;

public class Player {
		public final int playerId;
		public int positionId;
		public String team;
		public double shootingWeight;
		public double passingWeight;
		public double blockingWeight;
		
		// Players ability
		// 1. Shooting ability
		public double numShotMade;
		public double numShotAttempted;
		// 2 .Blocking ability
		public double numBlockMade;
		public double numBlockAttempted;
		// 3. Passing ability
		public double numPassMade;
		public double numPassAttempted;
		// 4. Intercepting ability
		public double numInterceptMade; 
		public double numInterceptAttempted; 
		
		public Player(int id) {
			this.playerId = id;
			numShotMade=0;
			numShotAttempted=0;
			numBlockMade=0;
			numBlockAttempted=0;
			numPassMade=0;
			numPassAttempted=0;
			numInterceptMade=0;
			numInterceptAttempted=0;
			this.team="unknown";
		}
		public Player(int id, String team) {
			this.playerId = id;
			numShotMade=0;
			numShotAttempted=0;
			numBlockMade=0;
			numBlockAttempted=0;
			numPassMade=0;
			numPassAttempted=0;
			numInterceptMade=0;
			numInterceptAttempted=0;
			this.team=team;
		}

		public String toString(){
			return "Player #: " + Integer.toString(playerId) + " from team [" + team +"]";
			
		}

		//the player has taken shot
		public void shotMade(){numShotMade++; }
		public void shotAttempted(){numShotAttempted++; } 
		public void shotFailed(){numShotMade--;}
		public void blockMade(){numBlockMade++;}
		public void blockAttempted(){numBlockAttempted++;}
		public void blockFailed(){numBlockMade--;}
		public void passMade(){numPassMade++;}
		public void passAttempted(){numPassAttempted++;}
		public void passFailed(){numPassMade--;}		
		public void interceptMade(){numInterceptMade++;}
		public void interceptAttempted(){numInterceptAttempted++;}
		public void interceptFailed(){numInterceptMade--;}
		public void interceptNullify(){numInterceptAttempted--; numInterceptMade--;};
		public void passNullify(){numPassAttempted--;numPassMade--;}
		public void shotNullify(){numShotMade--;numShotAttempted--;}
		public void blockNullify(){numBlockMade--;numBlockAttempted--;}

		//VERY CRUDE. NEED TO UPDATE THIS...
		public void updateShootingWeight(){
			shootingWeight += numShotMade/numShotAttempted;
		}
		public void updatePassingWeight(){
			passingWeight += numPassMade/numPassAttempted;
		}
		public void updateBlockingWeight(){
			blockingWeight += numBlockMade/numBlockAttempted;
		}

		public int hashCode(){
			return (playerId * 123456789) ^
		      		 (playerId * 987654321);
		}

		public boolean equals(Object obj)
		{
			if (!(obj instanceof Player))
				return false;
			Player p = (Player) obj;
			return playerId == p.playerId && team.equals(p.team);
		}
	}

