# legacy settings file
# (these settings used to be hard-coded in the converter)


# mappings for the extra, normally unused, pads on the IBM AT (84-key)

ifset set2 
remapblock
	FAKE_02 INTERNATIONAL_4
	FAKE_04 INTERNATIONAL_5
	FAKE_05 EUROPE_1
	FAKE_06 INTERNATIONAL_6
	FAKE_07 F13
	F11 F14
endblock


# macros to convert some keys on 83- and 84-key keyboard's to the 101-key equivalents

ifset set1 set2 
macroblock

# pause macro
macro NUM_LOCK ctrl
	PUSH_META CLEAR_META ctrl
	PRESS PAUSE
	POP_META 
endmacro

# printscreen macro
macro PAD_ASTERIX shift
	PUSH_META CLEAR_META shift
	PRESS PRINTSCREEN
	POP_META
endmacro

# break macro
macro SCROLL_LOCK ctrl
	PRESS PAUSE
endmacro

endblock


# default mappings for terminal 122-key keyboards

ifset set3
remapblock
	FAKE_06		BACKSLASH			# extra pad top of enter
	EUROPE_1	BACKSLASH			# key left of enter
	FAKE_08		INTERNATIONAL_2		# LF1
	FAKE_09		INTERNATIONAL_4		# LF2
	FAKE_10		INTERNATIONAL_5		# LF3
	FAKE_11		INTERNATIONAL_6		# LF4
	FAKE_12		LANG_3				# LF5
	FAKE_13		PAD_EQUALS			# LF6
	FAKE_14		PRINTSCREEN			# LF7
	FAKE_15		RGUI				# LF8
	FAKE_16		LGUI				# LF9
	FAKE_17		APP					# LF10
	FAKE_19		PAUSE
	PAD_PLUS	PAD_ENTER
endblock


# two sets of alternative mappings for terminal 122-key keyboards
# (set the keyboard's ID (jumpers or DIP switches) to use one)

ifset set3
ifkeyboard 9FBF
remapblock
	LANG_4		DOWN
	RALT		LGUI
	EUROPE_2	LGUI
	F13			MEDIA_PLAY_PAUSE
	F14			MEDIA_PREV_TRACK
	F15			MEDIA_NEXT_TRACK
	F16			MEDIA_VOLUME_UP
	F17			MEDIA_VOLUME_DOWN
endblock

ifset set3
ifkeyboard AFBF
remapblock
	FAKE_08			ESC				# LF1
	FAKE_09			PAUSE			# LF2
	FAKE_10			NUM_LOCK		# LF3
	FAKE_11			SCROLL_LOCK		# LF4
	ESC				NUM_LOCK
	NUM_LOCK		PAD_SLASH
	SCROLL_LOCK		PAD_ASTERIX
	FAKE_19			PAD_MINUS
	PAD_ASTERIX		PAD_PLUS
	PAD_MINUS		PAD_EQUALS
endblock


# reset conditionals in case this file is included from another file
ifset any
ifkeyboard any
ifselect any
