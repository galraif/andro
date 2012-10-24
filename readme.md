# Andro

Andro is a originally theme for MacRabbit's Espresso, that I made and am using. Expect updates, as I fiddle with the details.
It is also being ported to several other editors, and while they're not perfect copies of it, it's close enough. 
Currently supported editors:

+ **Textmate**
+ **Espresso**
+ **Komodo Edit**
+ **Sublime Text**

-----

![HTML](https://github.com/cyrilmengin/andro/raw/master/examples/AndroExampleHTML.png)

-----

![CSS](https://github.com/cyrilmengin/andro/raw/master/examples/AndroExampleCSS.png)

-----

![JavaScript](https://github.com/cyrilmengin/andro/raw/master/examples/AndroExampleJS.png)

-----

![PHP](https://github.com/cyrilmengin/andro/raw/master/examples/AndroExamplePHP.png)

-----

![Python](https://github.com/cyrilmengin/andro/raw/master/examples/AndroExamplePython.png)

-----

# Porting to Other Editors

If you're going to port Andro to another editor, please let me know, and I'll add it. 
Note that getting the same effect is pretty hard, as not many editors enable you to have as much flexibility as Espresso.
Here are the colors. Credit goes to [Neil](https://github.com/neilhanlon) for giving the RGB values.

	$background:          #292929    rgb(41,41,41)
	$highlight:           #3C3C3C;   rgb(60,60,60)
	$current:             #303030;   rgb(48,48,48)
	
	$blue:                #6B84A3;   rgb(107,132,163)
	$beige:               #E8BF6A;   rgb(232,191,122)
	$white:               #D6D6D6;   rgb(214,214,214)
	$brown:               #676767;   rgb(103,103,103)
	$orange:              #C24D43;   rgb(194,77,67)
	$grey:                #B9AA99;   rgb(185,170,153)

-----

# License

You can do whatever the hell you want. Really.
Use it, share it, modify it, smash it against the wall if you feel like it!
Be nice though, I'd appreciate a mention as the original author if you're going to be sharing it or building on it.

-----

# Installing Andro

All the files for the various IDEs are in the ``theme`` folder. 
Editor themes in the ``theme`` directory with a ``+`` in front of their names mean that they aren't a full port, that some things were lost.
I also suggest you use **Monaco** or **Menlo** as your font, at **11pt** or **12pt**.

Espresso
--------

Copy the the ``themes/Espresso/Andro.css`` file to ``~/Library/Application Support/Espresso/Themes/Andro.css``.
Open up Espresso,  go to ``Espresso ➜ Preferences ➜ Colors`` and set your active theme to Andro.

TextMate
--------

Open up the ``themes/+TextMate/Andro.tmTheme`` file in TextMate. Nothing should happen, but the app should open. 
Then select Andro as your theme in ``TextMate ➜ Preferences ➜ Fonts and Colors``.

Sublime Text 2
--------------

### Windows

Copy ``themes/+Sublime Text/Andro.tmTheme`` to ``~\AppData\Roaming\Sublime Text 2\Packages\User\Andro.tmTheme``.
Then open Sublime Text, and select ``Sublime Texte 2 ➜ Preferences ➜ Color Scheme ➜ User ➜ Andro``.

### Mac

Copy ``themes/+Sublime Text/Andro.tmTheme`` to ``~/Library/Application Support/Sublime Text 2/Packages/User/Andro.tmTheme``.
Then open Sublime Text, and select ``Sublime Texte 2 ➜ Preferences ➜ Color Scheme ➜ User ➜ Andro``.

Komodo Edit • [Neil Hanlon](https://github.com/neilhanlon)
---------------------------------------------------------

### Windows

Copy the ``theme/+Komodo Edit/Andro.ksf`` file to ``%AppData%\Local\ActiveState\KomodoEdit\<Version>\schemes\Andro.ksf``.
Then open Komodo Edit, and select Andro as your scheme under ``Edit ➜ Preferences ➜ Fonts & Colors``.

### Mac

Copy the ``theme/+Komodo Edit/Andro.ksf`` file to ``~/Library/Application Support/Komodo Edit/<Version>/schemes/Andro.ksf``.
Then open Komodo Edit, and select Andro as your scheme under ``Komodo Edit ➜ Preferences ➜ Fonts & Colors``.


