# YoRPG_NotEA
### Ye Olde RPG Game
### NotEA: Hasif Ahmed, Mohtasim Howlader, Kyle Tau (Team 10)
### *Protagonist*
#### Hero of the RPG
### *Monster*
#### Wants to kill our hero
### *Protagonists: Mage, Tank, Berserker*
### *Monsters: Witch, Golem, Goblin*
##### Mage/Witch: High HP, medium attack, and low defense
##### Tank/Golem: Medium HP, low attack, and high defense
##### Berserker/Goblin: Low HP, high attack, medium defense
### Feature Additions
##### Added ability for the user to choose specific attacks on each turn. Attacks are unique to each class.
##### Added a new Monster class, Boss, that appears once every 3 rounds.
##### Added getHP method and used that to report the HP of our hero after every turn.
##### Added special attack functionality that is high risk high reward.

#### Code Restructurings
##### The normal battle sequence has been altered so that it will only run when either one of the first two attacks are chosen.
##### The special attack has its own battle sequence.

### How to Play
##### The game first ask you to choose your difficulty. This determines how often you will encounter monsters in your quest.
##### Give yourself a name that portends greatness.
##### Choose one of the character classes. Their general advantages are stated at the top.
##### You will encounter a monster, usually either a Witch, Golem, or Goblin.
##### Every three encounters you will encounter a boss enemy.

#### Mage Attack Set
##### Fireball Spell: Normal attack with no modifications to stats.
##### Enhanced Firball Spell: 50% chance to either increase or decrease defense prior to the attack.
##### Regenerate: Regain 60 HP if successful, then normal attack.

#### Berserker Attack Set
##### Slash: Normal attack.
##### Heightened Slash: 50% chance to either increase or decrease defense prior to the attack.
##### Berserker's Bane: Major upgrades to attack and defense stats if successful, then attack.

#### Tank Attack Set
##### Blast: Normal Attack.
##### Enhanced Blast: 50% chance to either increase or decrease defense prior to the attack.
##### Full Overdrive: Major increase to defense and attack stats if successful, then attack.

#### The game is over when you are killed or after 15 encounters.
