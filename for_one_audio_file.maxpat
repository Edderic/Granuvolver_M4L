{
	"patcher" : 	{
		"fileversion" : 1,
		"appversion" : 		{
			"major" : 6,
			"minor" : 1,
			"revision" : 1,
			"architecture" : "x64"
		}
,
		"rect" : [ -400.0, 1170.0, 640.0, 480.0 ],
		"bglocked" : 0,
		"openinpresentation" : 1,
		"default_fontsize" : 12.0,
		"default_fontface" : 0,
		"default_fontname" : "Arial",
		"gridonopen" : 0,
		"gridsize" : [ 15.0, 15.0 ],
		"gridsnaponopen" : 0,
		"statusbarvisible" : 2,
		"toolbarvisible" : 1,
		"boxanimatetime" : 200,
		"imprint" : 0,
		"enablehscroll" : 1,
		"enablevscroll" : 1,
		"devicewidth" : 0.0,
		"description" : "",
		"digest" : "",
		"tags" : "",
		"boxes" : [ 			{
				"box" : 				{
					"id" : "obj-3",
					"maxclass" : "bpatcher",
					"name" : "for_one_channel.maxpat",
					"numinlets" : 0,
					"numoutlets" : 0,
					"offset" : [ -17.0, -15.0 ],
					"patching_rect" : [ 286.0, 38.0, 269.0, 44.0 ],
					"presentation" : 1,
					"presentation_rect" : [ 0.0, 43.0, 258.0, 44.0 ]
				}

			}
, 			{
				"box" : 				{
					"id" : "obj-2",
					"maxclass" : "bpatcher",
					"name" : "for_one_channel.maxpat",
					"numinlets" : 0,
					"numoutlets" : 0,
					"offset" : [ -17.0, -15.0 ],
					"patching_rect" : [ 286.0, -5.0, 269.0, 44.0 ],
					"presentation" : 1,
					"presentation_rect" : [ 0.0, 0.0, 258.0, 44.0 ]
				}

			}
, 			{
				"box" : 				{
					"decodemode" : 1,
					"id" : "obj-5",
					"maxclass" : "live.drop",
					"numinlets" : 1,
					"numoutlets" : 2,
					"outlettype" : [ "", "" ],
					"parameter_enable" : 1,
					"patching_rect" : [ -1.0, -5.0, 255.0, 85.0 ],
					"presentation" : 1,
					"presentation_rect" : [ 0.0, 0.0, 256.0, 85.0 ],
					"saved_attribute_attributes" : 					{
						"valueof" : 						{
							"parameter_type" : 4,
							"parameter_invisible" : 1,
							"parameter_shortname" : "live.drop",
							"parameter_longname" : "live.drop"
						}

					}
,
					"varname" : "live.drop"
				}

			}
 ],
		"lines" : [  ],
		"parameters" : 		{
			"obj-5" : [ "live.drop", "live.drop", 0 ]
		}
,
		"dependency_cache" : [ 			{
				"name" : "for_one_channel.maxpat",
				"bootpath" : "/Users/edderic/Dropbox/COMPSCI/Developer/VST/Granuvolver",
				"patcherrelativepath" : ".",
				"type" : "JSON",
				"implicit" : 1
			}
 ]
	}

}
