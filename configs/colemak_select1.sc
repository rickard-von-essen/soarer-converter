# toggle between qwerty and colemak by pressing lshift-lctrl-lalt-1

ifselect 1

include colemak.sc

ifselect any
macroblock

macro 1 lctrl lshift lalt
	PRESS SELECT_1
endmacro

endblock
