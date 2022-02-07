package com.example.composetwitterprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetwitterprofile.ui.theme.ComposeTwitterProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTwitterProfileTheme {
                // A surface container using the 'background' color from the theme
                profile()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePreview() {
    ComposeTwitterProfileTheme  {
        profile()
    }
}

@Composable
fun profile(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colors.background)){
        Row(
            modifier = Modifier
                .padding(
                    start = 15.dp,
                    top = 15.dp, end = 15.dp, bottom = 8.dp
                )
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                contentDescription = "Back Arroe",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                Text(text = "John Mwai",
                    color = Color.White,
                    fontSize= 20.sp,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(text = "814 tweets",
                    style = MaterialTheme.typography.caption,
                    color = Color.Gray,
                    fontSize = 13.sp)
            }
        }

        Box(
            modifier = Modifier
                .height(220.dp)
                .fillMaxSize()
        ){
            Box(modifier = Modifier
                .fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.header_image),
                    contentDescription = "Header Image")
            }

            Box( modifier = Modifier
                .fillMaxSize()
                .padding(start = 15.dp, bottom = 15.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(
                    id = R.drawable.photo),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(120.dp)
                        .border(
                            2.dp, MaterialTheme.colors.background,
                            CircleShape
                        ))
            }

            Box( modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 1.dp,
                    top = 15.dp, end = 15.dp, bottom = 40.dp
                ),
                contentAlignment = Alignment.BottomEnd
            ){
                OutlinedButton(onClick = { /*TODO*/ },
                    shape = CircleShape,
                    border= BorderStroke(1.dp, Color.Gray,),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.background,
                        contentColor = Color.White)
                ) {
                    Text(text = "Edit profile",
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold)
                }
            }
        }

        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Column {
                Text(text = "John Mwai",
                    color = Color.White,
                    fontSize= 20.sp,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(text = "@HelloMwai",
                    style = MaterialTheme.typography.caption,
                    color = Color.Gray,
                    fontSize = 13.sp)

                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "#android #backend #kotlin",
                    style = MaterialTheme.typography.caption,
                    color = Color(0xFF1D98F0),
                    fontSize = 13.sp)
                Spacer(modifier = Modifier.height(1.dp))
                Text(text = "Eternal student, Software developer,Programmer",
                    style = MaterialTheme.typography.caption,
                    color = Color.White,
                    fontSize = 13.sp)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "watch me build, \nwatch me write, \nwatch me fail, \nwatch me succeed",
                    style = MaterialTheme.typography.caption,
                    color = Color.White,
                    fontSize = 13.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Icon(painter = painterResource(R.drawable.location), tint = Color.Gray , contentDescription = "DOB")
                    Spacer(modifier = Modifier.width(2.dp))
                    Text("World",
                        color = Color.Gray,)
                    Spacer(modifier = Modifier.width(15.dp))
                    Icon(painter = painterResource(R.drawable.ic_baseline_link), tint = Color.Gray , contentDescription = "DOB")
                    Spacer(modifier = Modifier.width(2.dp))
                    Text("github.com/mwaijohn",
                        color = Color(0xFF1D98F0),)
                }
                Spacer(modifier = Modifier.height(0.5.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround) {
                    Icon(painter = painterResource(R.drawable.balloon), tint = Color.Gray , contentDescription = "DOB")
                    Spacer(modifier = Modifier.width(2.dp))
                    Text("Born September 10, 1996",
                        color = Color.Gray,)
                    Spacer(modifier = Modifier.width(15.dp))
                    Icon(painter = painterResource(R.drawable.date), tint = Color.Gray , contentDescription = "DOB")
                    Spacer(modifier = Modifier.width(2.dp))
                    Text("Joined March 2017",
                        color = Color.Gray)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround) {
                    Row(){
                        Text("706",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(7.dp))
                        Text("Following",
                            color = Color.Gray)
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Row(){
                        Text("298",
                            color = Color.White,
                            fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(7.dp))
                        Text("Followers",
                            color = Color.Gray)
                    }
                }
            }
        }
    }
}