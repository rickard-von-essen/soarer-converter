# basic layer example - cursors on r.h. home position when caps lock is held

# define that FN1 accesses layer 1
layerblock
	FN1 1
	FN2 1		# in case FN2 is used as well, define it as an alternative
	FN1 FN2 1	# both together still gets layer 1
endblock

# the layer itself is just some remaps tagged with the layer number
remapblock
layer 1
	I UP
	J LEFT
	K DOWN
	L RIGHT
endblock

# need to map the FN key into the base layer (0)
remapblock
layer 0
	CAPS_LOCK FN1
endblock
