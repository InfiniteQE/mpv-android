//!HOOK OUTPUT
//!BIND HOOKED
//!DESC LitByLeia_2x2_4V

vec4 myColor;
vec2 pos;
float halfX;
float halfY;
float viewID;

vec4 hook(){
	vec4 myColor = HOOKED_texOff(0);
	vec2 pos = HOOKED_pos;
	float halfX = pos.x / 2.0;
	float halfY = pos.y / 2.0;
	float viewID = mod(floor(gl_FragCoord.x), 4.0);

    if (viewID < 0.5) {
    	// fl (top-left)
    	myColor = HOOKED_tex(vec2(halfX, halfY));
	} else if(viewID < 1.5) {
		// l (top-right)
		myColor = HOOKED_tex(vec2(0.5 + halfX, halfY));
	} else if(viewID < 2.5) {
		// r (bottom-left)
		myColor = HOOKED_tex(vec2(halfX, 0.5 + halfY));
	} else {
		// fr (bottom-right)
		myColor = HOOKED_tex(vec2(0.5 + halfX, 0.5 + halfY));
	}

    return myColor;
}