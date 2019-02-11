/**
 * Created by KIP-PC99 on 15.01.2019.
 */
window.onload = function () {
    connect();
}

var stompClient = null;
function connect() {
    var socket = new SockJS('/guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);

        stompClient.subscribe('/topic/subscribe-winder-right-set-length', function(result){
            var parsed = JSON.parse(result.body);
            var register0 = parsed.value;
            document.getElementById("SetLengthRReadValue").setAttribute('value', register0);
        });

        stompClient.subscribe('/topic/subscribe-winder-right-current-length', function(result){
            var parsed = JSON.parse(result.body);
            var register1 = parsed.value;
            document.getElementById("CurrentLengthRReadValue").setAttribute('value', register1);
        });

        stompClient.subscribe('/topic/subscribe-winder-right-all-length', function(result){
            var parsed = JSON.parse(result.body);
            var register2 = parsed.value;
            document.getElementById("AllLengthRReadValue").setAttribute('value', register2);
        });

        stompClient.subscribe('/topic/subscribe-winder-right-speed-read', function(result){
            var parsed = JSON.parse(result.body);
            var register3 = parsed.value;
            document.getElementById("SpeedReadRValue").setAttribute('value', register3);
        });

        stompClient.subscribe('/topic/subscribe-winder-right-bobbin', function(result){
            var parsed = JSON.parse(result.body);
            var register4 = parsed.value;
            document.getElementById("BobbinReadRValue").setAttribute('value', register4);
        });

        stompClient.subscribe('/topic/subscribe-winder-left-set-length', function(result){
            var parsed = JSON.parse(result.body);
            var register0 = parsed.value;
            document.getElementById("SetLengthLReadValue").setAttribute('value', register0);
        });

        stompClient.subscribe('/topic/subscribe-winder-left-current-length', function(result){
            var parsed = JSON.parse(result.body);
            var register1 = parsed.value;
            document.getElementById("CurrentLengthLReadValue").setAttribute('value', register1);
        });

        stompClient.subscribe('/topic/subscribe-winder-left-all-length', function(result){
            var parsed = JSON.parse(result.body);
            var register2 = parsed.value;
            document.getElementById("AllLengthLReadValue").setAttribute('value', register2);
        });

        stompClient.subscribe('/topic/subscribe-winder-left-speed-read', function(result){
            var parsed = JSON.parse(result.body);
            var register3 = parsed.value;
            document.getElementById("SpeedReadLValue").setAttribute('value', register3);
        });

        stompClient.subscribe('/topic/subscribe-winder-left-bobbin', function(result){
            var parsed = JSON.parse(result.body);
            var register4 = parsed.value;
            document.getElementById("BobbinReadLValue").setAttribute('value', register4);
        });

    });
}

document.getElementById("SetLengthRWriteValue").addEventListener("change", function sendChartBody() {
    var leng = document.getElementById("SetLengthRWriteValue").value;

    var data = JSON.stringify({'value' : leng});
    stompClient.send("/app/send-winder-right-set-length", {}, data);
});

document.getElementById("SetLengthLWriteValue").addEventListener("change", function sendChartBody() {
    var leng = document.getElementById("SetLengthLWriteValue").value;

    var data = JSON.stringify({'value' : leng});
    stompClient.send("/app/send-winder-left-set-length", {}, data);
});

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}